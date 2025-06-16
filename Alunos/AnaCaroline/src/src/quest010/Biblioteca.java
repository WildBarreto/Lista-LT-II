package quest010;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = livros.stream().filter(l -> l.getIsbn().equals(isbn) && !l.isEmprestado()).findFirst().orElse(null);
        Usuario usuario = usuarios.get(usuarioId);

        if (livro != null && usuario != null && usuario.podeEmprestar()) {
            livro.emprestar();
            usuario.adicionarLivro(livro);
            System.out.println("Livro emprestado: " + livro);
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    public void devolverLivro(String isbn) {
        for (Usuario usuario : usuarios.values()) {
            for (Livro livro : new ArrayList<>(usuario.livrosEmprestados)) {
                if (livro.getIsbn().equals(isbn)) {
                    livro.devolver();
                    usuario.removerLivro(livro);
                    System.out.println("Livro devolvido: " + livro);
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado entre empréstimos.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(" - " + livro);
            }
        }
    }
}
