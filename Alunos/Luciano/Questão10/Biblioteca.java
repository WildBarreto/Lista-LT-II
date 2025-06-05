package Questão10;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = encontrarLivro(isbn);
        Usuario usuario = encontrarUsuario(usuarioId);

        if (livro == null || usuario == null) {
            System.out.println("Livro ou usuário não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário atingiu o limite de empréstimos.");
            return;
        }

        livro.emprestar();
        usuario.adicionarLivro(livro);
        System.out.println("Livro emprestado com sucesso a " + usuarioId);
    }

    public void devolverLivro(String isbn) {
        Livro livro = encontrarLivro(isbn);
        if (livro == null || !livro.isEmprestado()) {
            System.out.println("Livro não está emprestado ou não encontrado.");
            return;
        }

        for (Usuario u : usuarios) {
            if (u.getLivrosEmprestados().contains(livro)) {
                u.removerLivro(livro);
                livro.devolver();
                System.out.println("Livro devolvido por " + u.getId());
                return;
            }
        }

        System.out.println("Usuário com o livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro l : livros) {
            if (!l.isEmprestado()) {
                System.out.println(" - " + l);
            }
        }
    }

    private Livro encontrarLivro(String isbn) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    private Usuario encontrarUsuario(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }
}
