/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

import java.util.*;

/**
 *
 * @author analu
 */

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestar(String isbn, String usuarioId) {
        Livro livro = encontrarLivro(isbn);
        Usuario usuario = encontrarUsuario(usuarioId);

        if (livro == null || usuario == null) {
            System.out.println("\nLivro ou usuario nao encontrado");
            return;
        }

        if (livro.Emprestado()) {
            System.out.println("Este livro ja esta emprestado");
        } else if (!usuario.permitir()) {
            System.out.println("Esse usuario ja atingiu o limite de emprestimos");
        } else {
            usuario.emprestar(livro);
            System.out.println("Livro emprestado com sucesso!");
        }
    }

    public void devolver(String isbn) {
        Livro livro = encontrarLivro(isbn);
        if (livro == null || !livro.Emprestado()) {
            System.out.println("Livro nao encontrado ou nao esta emprestado");
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getEmprestados().contains(livro)) {
                usuario.devolver(livro);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
    }

    public void listarLivros() {
        System.out.println("\n--- Livros Disponiveis ---");
        boolean Disponivel = false;

        for (Livro livro : livros) {
            if (!livro.Emprestado()) {
                System.out.println(livro.getInfo());
                Disponivel = true;
        }
    }

        if (!Disponivel) {
            System.out.println("Nenhum livro disponivel para emprestimo.");
        }
    }

    private Livro encontrarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) return livro;
        }
        return null;
    }

    private Usuario encontrarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) return usuario;
        }
        return null;
    }
}
