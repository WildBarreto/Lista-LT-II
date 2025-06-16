package ProjetoBiblioteca;

/**
 *
 * @author imidi
 */
public class Livro {
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

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (ISBN: " + isbn + ") " + (emprestado ? "[Emprestado]" : "[Disponivel]");
    }
    
}
