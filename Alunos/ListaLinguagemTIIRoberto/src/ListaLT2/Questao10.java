package ListaLT2;
import java.util.*;

public class Questao10 {

    static class Livro {
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

        public String getIsbn() { return isbn; }
        public boolean isEmprestado() { return emprestado; }
        public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

        @Override
        public String toString() {
            return titulo + " - " + autor + " (ISBN: " + isbn + ") - " +
                   (emprestado ? "Emprestado" : "Disponivel");
        }
    }

    static abstract class Usuario {
        protected String nome;
        protected String id;
        protected List<Livro> livrosEmprestados = new ArrayList<>();

        public Usuario(String nome, String id) {
            this.nome = nome;
            this.id = id;
        }

        public String getId() { return id; }
        public String getNome() { return nome; }
        public List<Livro> getLivrosEmprestados() { return livrosEmprestados; }

        public abstract boolean podeEmprestar();

        public void adicionarLivro(Livro livro) {
            livrosEmprestados.add(livro);
        }

        public void removerLivro(Livro livro) {
            livrosEmprestados.remove(livro);
        }

        @Override
        public String toString() {
            return nome + " (ID: " + id + ") - Livros com ele: " + livrosEmprestados.size();
        }
    }

    static class UsuarioComum extends Usuario {
        public UsuarioComum(String nome, String id) {
            super(nome, id);
        }

        @Override
        public boolean podeEmprestar() {
            return livrosEmprestados.size() < 3;
        }
    }

    static class UsuarioPremium extends Usuario {
        public UsuarioPremium(String nome, String id) {
            super(nome, id);
        }

        @Override
        public boolean podeEmprestar() {
            return true;
        }
    }

    static class Biblioteca {
        private List<Livro> livros = new ArrayList<>();
        private Map<String, Usuario> usuarios = new HashMap<>();

        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }

        public void adicionarUsuario(Usuario usuario) {
            usuarios.put(usuario.getId(), usuario);
        }

        public void emprestarLivro(String isbn, String usuarioId) {
            Livro livro = buscarLivro(isbn);
            Usuario usuario = usuarios.get(usuarioId);

            if (livro == null) {
                System.out.println("Livro com ISBN " + isbn + " nao encontrado.");
                return;
            }
            if (usuario == null) {
                System.out.println("Usuario com ID " + usuarioId + " nao encontrado.");
                return;
            }
            if (livro.isEmprestado()) {
                System.out.println("Livro ja emprestado.");
                return;
            }
            if (!usuario.podeEmprestar()) {
                System.out.println("Usuario atingiu o limite de emprestimos.");
                return;
            }

            livro.setEmprestado(true);
            usuario.adicionarLivro(livro);
            System.out.println("Livro emprestado com sucesso.");
        }

        public void devolverLivro(String isbn) {
            Livro livro = buscarLivro(isbn);
            if (livro == null || !livro.isEmprestado()) {
                System.out.println("Livro nao esta emprestado ou nao encontrado.");
                return;
            }

            for (Usuario u : usuarios.values()) {
                if (u.getLivrosEmprestados().contains(livro)) {
                    u.removerLivro(livro);
                    break;
                }
            }

            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso.");
        }

        public void listarLivrosDisponiveis() {
            for (Livro l : livros) {
                if (!l.isEmprestado()) {
                    System.out.println(l);
                }
            }
        }

        public void listarUsuarios() {
            for (Usuario u : usuarios.values()) {
                System.out.println(u);
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "001"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "002"));
        biblioteca.adicionarLivro(new Livro("O Hobbit", "Tolkien", "003"));

        biblioteca.adicionarUsuario(new UsuarioComum("Joao", "U1"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Maria", "U2"));

        int opcao;
        do {
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1 - Listar livros disponiveis");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Listar usuarios");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 2:
                    System.out.print("ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("ID do usuario: ");
                    String id = scanner.nextLine();
                    biblioteca.emprestarLivro(isbn, id);
                    break;
                case 3:
                    System.out.print("ISBN do livro a devolver: ");
                    String isbnDev = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDev);
                    break;
                case 4:
                    biblioteca.listarUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }
}
