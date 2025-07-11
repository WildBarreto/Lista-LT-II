package Questao10;

import java.util.*;

public class Biblioteca {

    private Map<String, Livro> livros = new HashMap<>();
    private Map<String, Usuario> usuarios = new HashMap<>();

    // Adiciona um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.put(livro.getIsbn(), livro);
    }

    // Adiciona um usuário à biblioteca
    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    // Método para emprestar um livro para um usuário
    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = livros.get(isbn);
        Usuario usuario = usuarios.get(usuarioId);

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
        System.out.println("Livro emprestado com sucesso!");
    }

    // Método para devolver um livro à biblioteca
    public void devolverLivro(String isbn) {
        Livro livro = livros.get(isbn);

        if (livro == null || !livro.isEmprestado()) {
            System.out.println("Livro inválido ou não está emprestado.");
            return;
        }

        for (Usuario u : usuarios.values()) {
            if (u.getLivrosEmprestados().contains(livro)) {
                u.removerLivro(livro);
                break;
            }
        }

        livro.devolver();
        System.out.println("Livro devolvido com sucesso!");
    }

    // Lista os livros disponíveis para empréstimo
    public void listarLivrosDisponiveis() {
        System.out.println("=== Livros Disponíveis ===");
        for (Livro livro : livros.values()) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }

    // Relatório com o status dos empréstimos por usuário
    public void relatorioStatus() {
        System.out.println("\n=== Relatório de Empréstimos ===");
        for (Usuario u : usuarios.values()) {
            System.out.println(u + " possui " + u.getLivrosEmprestados().size() + " livros:");
            for (Livro l : u.getLivrosEmprestados()) {
                System.out.println("  - " + l);
            }
        }
    }
}
