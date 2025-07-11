package Exercicio10;

/**
 *
 * @author Fernanda Santos
 */
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

    public Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public boolean emprestarLivro(String isbn, int usuarioId) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(usuarioId);

        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return false;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return false;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro ja esta emprestado.");
            return false;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário atingiu o limite de emprestimos.");
            return false;
        }

        livro.emprestar();
        usuario.adicionarLivro(livro);
        System.out.println("Livro emprestado com sucesso!");
        return true;
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = buscarLivroPorIsbn(isbn);

        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return false;
        }

        if (!livro.isEmprestado()) {
            System.out.println("Livro nao esta emprestado.");
            return false;
        }

        
        for (Usuario usuario : usuarios) {
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.removerLivro(livro);
                break;
            }
        }

        livro.devolver();
        System.out.println("Livro devolvido com sucesso!");
        return true;
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }

    public void listarUsuarios() {
        System.out.println("Usuarios cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

     public void listarEstadoLivros() {
    for (Livro livro : livros) {
        String status = livro.isEmprestado() ? "Nao" : "Sim";
        System.out.printf("- Titulo: %s, Disponivel: %s%n", livro.getTitulo(), status);
    }
}
    }
