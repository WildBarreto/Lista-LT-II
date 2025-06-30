package questão10;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros;
    private final List<Usuario> usuarios;

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

    public Livro buscarLivroPorIsbn(String isbn) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn.toUpperCase())) {
                return l;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id.toUpperCase())) {
                return u;
            }
        }
        return null;
    }

    public boolean emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(usuarioId);

        if (livro == null) {
            System.out.println("LIVRO NÃO ENCONTRADO.");
            return false;
        }

        if (usuario == null) {
            System.out.println("USUÁRIO NÃO ENCONTRADO.");
            return false;
        }

        if (livro.isEmprestado()) {
            System.out.println("LIVRO JÁ ESTÁ EMPRESTADO.");
            return false;
        }

        if (usuario.emprestarLivro(livro)) {
            livro.setEmprestado(true);
            System.out.println("EMPRÉSTIMO REALIZADO COM SUCESSO.");
            return true;
        } else {
            System.out.println("LIMITE DE EMPRÉSTIMOS ATINGIDO PARA ESTE USUÁRIO.");
            return false;
        }
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = buscarLivroPorIsbn(isbn);

        if (livro == null) {
            System.out.println("LIVRO NÃO ENCONTRADO.");
            return false;
        }

        if (!livro.isEmprestado()) {
            System.out.println("LIVRO NÃO ESTÁ EMPRESTADO.");
            return false;
        }

        for (Usuario u : usuarios) {
            if (u.getLivrosEmprestados().contains(livro)) {
                u.devolverLivro(livro);
                livro.setEmprestado(false);
                System.out.println("DEVOLUÇÃO REALIZADA COM SUCESSO.");
                return true;
            }
        }
        System.out.println("USUÁRIO COM ESTE LIVRO NÃO ENCONTRADO.");
        return false;
    }

    public void listarLivrosDisponiveis() {
        System.out.println("=== LIVROS DISPONÍVEIS ===");
        for (Livro l : livros) {
            if (!l.isEmprestado()) {
                System.out.println(l);
            }
        }
    }

    public void listarUsuarios() {
        System.out.println("=== LISTA DE USUÁRIOS ===");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
