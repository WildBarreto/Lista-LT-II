package Questão10;

import java.util.*;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    Map<Integer, Usuario> usuarios = new HashMap<>();

    void adicionarLivro(Livro l) {
        livros.add(l);
    }

    void adicionarUsuario(Usuario u) {
        usuarios.put(u.id, u);
    }

    void emprestarLivro(String isbn, int usuarioId) {
        Usuario u = usuarios.get(usuarioId);
        for (Livro l : livros) {
            if (l.isbn.equals(isbn) && !l.emprestado) {
                if (u instanceof UsuarioComum && ((UsuarioComum) u).livrosEmprestados >= 3) {
                    System.out.println("Limite atingido.");
                    return;
                }
                l.emprestado = true;
                if (u instanceof UsuarioComum)
                    ((UsuarioComum) u).livrosEmprestados++;
                System.out.println("Livro emprestado.");
                return;
            }
        }
        System.out.println("Livro indisponível.");
    }

    void devolverLivro(String isbn) {
        for (Livro l : livros) {
            if (l.isbn.equals(isbn) && l.emprestado) {
                l.emprestado = false;
                System.out.println("Livro devolvido.");
                return;
            }
        }
    }

    void listarLivrosDisponiveis() {
        for (Livro l : livros) {
            if (!l.emprestado)
                System.out.println(l.titulo + " - " + l.autor);
        }
    }
}
