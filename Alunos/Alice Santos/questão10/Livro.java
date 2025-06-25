package questão10;

public class Livro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo.toUpperCase();
        this.autor = autor.toUpperCase();
        this.isbn = isbn.toUpperCase();
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "TÍTULO: " + titulo + ", AUTOR: " + autor + ", ISBN: " + isbn
               + ", EMPRESTADO: " + (emprestado ? "SIM" : "NÃO");
    }
}
