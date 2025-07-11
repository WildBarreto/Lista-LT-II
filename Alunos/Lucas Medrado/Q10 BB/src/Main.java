import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean status) {
        this.emprestado = status;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") - ISBN: " + isbn + " - " + (emprestado ? "Emprestado" : "Disponivel");
    }
}

abstract class Usuario {
    private String nome;
    private String id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public abstract boolean podePegarEmprestado();

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(String isbn) {
        livrosEmprestados.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public int getQuantidadeLivros() {
        return livrosEmprestados.size();
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ") - " + this.getClass().getSimpleName();
    }
}

class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podePegarEmprestado() {
        return true;
    }
}

class UsuarioComum extends Usuario {
    private static final int LIMITE_LIVROS = 3;

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podePegarEmprestado() {
        return getQuantidadeLivros() < LIMITE_LIVROS;
    }
}

class Biblioteca {
    private Map<String, Livro> livros;
    private Map<String, Usuario> usuarios;

    public Biblioteca() {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.put(livro.getIsbn(), livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public boolean emprestarLivro(String isbn, String usuarioId) {
        Livro livro = livros.get(isbn);
        Usuario usuario = usuarios.get(usuarioId);

        if (livro == null || usuario == null || livro.isEmprestado() || !usuario.podePegarEmprestado()) {
            return false;
        }

        livro.setEmprestado(true);
        usuario.adicionarLivro(livro);
        return true;
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = livros.get(isbn);
        if (livro == null || !livro.isEmprestado()) {
            return false;
        }

        livro.setEmprestado(false);
        usuarios.values().forEach(u -> u.removerLivro(isbn));
        return true;
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        livros.values().forEach(l -> {
            if (!l.isEmprestado()) {
                disponiveis.add(l);
            }
        });
        return disponiveis;
    }

    public void gerarRelatorio() {
        System.out.println("=== RELATORIO ===");
        System.out.println("Total livros: " + livros.size());
        System.out.println("Livros disponiveis: " + listarLivrosDisponiveis().size());
        System.out.println("Usuarios: " + usuarios.size());
        
        System.out.println("\nLivros emprestados:");
        livros.values().stream()
             .filter(Livro::isEmprestado)
             .forEach(System.out::println);
        
        System.out.println("\nUsuarios:");
        usuarios.values().forEach(u -> {
            System.out.println(u + " - Livros: " + u.getQuantidadeLivros());
        });
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "001"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "002"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", "003"));
        biblioteca.adicionarLivro(new Livro("Harry Potter", "J.K. Rowling", "004"));

        biblioteca.adicionarUsuario(new UsuarioComum("Joao Silva", "100"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Maria Souza", "200"));

        System.out.println("Emprestimos:");
        System.out.println("Joao pega Dom Casmurro: " + biblioteca.emprestarLivro("001", "100"));
        System.out.println("Joao pega 1984: " + biblioteca.emprestarLivro("002", "100"));
        System.out.println("Maria pega O Senhor dos Aneis: " + biblioteca.emprestarLivro("003", "200"));
        System.out.println("Joao tenta pegar Harry Potter: " + biblioteca.emprestarLivro("004", "100"));

        System.out.println("\nDevolucao 002:");
        System.out.println("Devolvido: " + biblioteca.devolverLivro("002"));

        System.out.println("\nJoao tenta pegar Harry Potter novamente:");
        System.out.println("Emprestimo: " + biblioteca.emprestarLivro("004", "100"));

        biblioteca.gerarRelatorio();
    }
}
