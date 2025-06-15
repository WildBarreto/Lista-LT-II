package Exercicio10;

/**
 *
 * @author Fernanda Santos
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

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (ISBN: " + isbn + ") - " + (emprestado ? "Emprestado" : "Disponivel");
    }
}