package AnaHeloisia4info.questao10;

import java.util.ArrayList;

public class Biblioteca {
  
    private ArrayList<Livro> Livros;
    private ArrayList<Usuario> Usuarios;

    public Biblioteca() {
        Livros = new ArrayList<>();
        Usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        Livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        Usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
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
        usuario.emprestarLivro(livro);
        System.out.println("\nLivro emprestado com sucesso para " + usuario.getNome() + ".");
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);
        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("\nLivro não está emprestado.");
            return;
        }

        for (Usuario usuario : Usuarios) {
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.devolverLivro(livro);
                livro.setEmprestado(false);
                System.out.println("\nLivro devolvido com sucesso por " + usuario.getNome() + ".");
                return;
            }
        }

        System.out.println("\nUsuário que emprestou o livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("    Livros Disponíveis    \n ");
        for (Livro livro : Livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro.getTitulo() + " - Autor: " + livro.getAutor() + " - ISBN: " + livro.getIsbn());
            }
        }
        System.out.println("\n\n");
    }

    private Livro buscarLivro(String isbn) {
        for (Livro livro : Livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String id) {
        for (Usuario usuario : Usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}