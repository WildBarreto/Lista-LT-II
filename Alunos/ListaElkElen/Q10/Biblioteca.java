/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

/**
 *
 * @author elkin
 */
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

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
            System.out.println("Livro já está emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário atingiu o limite de empréstimos.");
            return;
        }

        livro.setEmprestado(true);
        usuario.adicionarLivro(livro);
        System.out.println("Livro emprestado com sucesso.");
    }

    public void devolverLivro(String isbn, int usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null || usuario == null) {
            System.out.println("Livro ou usuário não encontrado.");
            return;
        }

        if (!usuario.temLivro(isbn)) {
            System.out.println("Esse usuário não possui este livro.");
            return;
        }

        livro.setEmprestado(false);
        usuario.removerLivro(isbn);
        System.out.println("Livro devolvido com sucesso.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("=== Livros Disponíveis ===");
        for (Livro l : livros) {
            if (!l.isEmprestado()) {
                System.out.println(l);
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
    
    public Usuario buscarUsuarioPublico(int id) {
    return buscarUsuario(id); // reutiliza o método privado
}
}

