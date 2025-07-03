/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

    
 import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, int usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null || usuario == null) {
            System.out.println("Livro ou usuário não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro já emprestado.");
            return;
        }

        if (usuario.podeEmprestar()) {
            livro.setEmprestado(true);
            usuario.getLivrosEmprestados().add(livro);
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Limite de empréstimos atingido.");
        }
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);
        if (livro == null || !livro.isEmprestado()) {
            System.out.println("Livro não está emprestado.");
            return;
        }

        for (Usuario u : usuarios) {
            if (u.getLivrosEmprestados().remove(livro)) {
                livro.setEmprestado(false);
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro l : livros) {
            if (!l.isEmprestado()) {
                System.out.println("- " + l);
            }
        }
    }

    private Livro buscarLivro(String isbn) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public void listarStatusUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getNome() + " - Livros emprestados:");
            for (Livro l : u.getLivrosEmprestados()) {
                System.out.println("  -> " + l);
            }
        }
    }
}
   
     
    


