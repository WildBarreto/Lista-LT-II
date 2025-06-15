
package Questão10;

import java.util.*;

public class Biblioteca {
    private Map<String, Livro> livros = new HashMap<>();
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        livros.put(livro.getIsbn(), livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = livros.get(isbn);
        Usuario usuario = usuarios.get(usuarioId);

        if (livro == null || usuario == null) {
            System.out.println("Livro indisponivel ou usuario nao encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro esta emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuario atingiu o limite de emprestimos.");
            return;
        }

        livro.setEmprestado(true);
        usuario.adicionarLivro(livro);
        System.out.println("Livro emprestado com sucesso para " + usuarioId);
    }

    public void devolverLivro(String isbn) {
        Livro livro = livros.get(isbn);
        if (livro == null || !livro.isEmprestado()) {
            System.out.println("Livro nao encontrado ou nao esta emprestado.");
            return;
        }

        livro.setEmprestado(false);

        for (Usuario u : usuarios.values()) {
            if (u.livrosEmprestados.contains(livro)) {
                u.removerLivro(livro);
                System.out.println("Livro devolvido por " + u.getId());
                return;
            }
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
        for (Livro l : livros.values()) {
            if (!l.isEmprestado()) {
                System.out.println(l);
            }
        }
    }

    public void listarUsuarios() {
        System.out.println("Usuarios:");
        for (Usuario u : usuarios.values()) {
            System.out.println(u);
        }
    }
}

