package ProjetoBiblioteca;

/**
 *
 * @author imidi
 */
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

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

    public void emprestarLivro(String isbn, int usuarioId) {
        Livro livro = encontrarLivro(isbn);
        Usuario usuario = encontrarUsuario(usuarioId);

        if (livro == null) {
            System.out.println("Livro nao encontrado.");
        } else if (usuario == null) {
            System.out.println("Usuario nao encontrado.");
        } else if (livro.isEmprestado()) {
            System.out.println("Livro ja emprestado.");
        } else if (!usuario.podeEmprestar()) {
            System.out.println("Usuario atingiu o limite de emprestimos.");
        } else {
            livro.emprestar();
            usuario.adicionarLivro(livro);
            System.out.println("Livro emprestado com sucesso a " + usuario);
        }
    }

    public void devolverLivro(String isbn) {
        Livro livro = encontrarLivro(isbn);
        if (livro == null || !livro.isEmprestado()) {
            System.out.println("Livro não encontrado ou nao esta emprestado.");
            return;
        }

        livro.devolver();

        for (Usuario u : usuarios) {
            if (u.livrosEmprestados.contains(livro)) {
                u.removerLivro(livro);
                break;
            }
        }

        System.out.println("Livro devolvido com sucesso.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
        for (Livro l : livros) {
            if (!l.isEmprestado()) {
                System.out.println(l);
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

    private Usuario encontrarUsuario(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
