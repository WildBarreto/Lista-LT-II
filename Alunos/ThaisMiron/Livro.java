package l.t.pkg2;

public class Livro {
    
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro() {
    }
    
    public Livro(String titulo, String autor, String isbn, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", emprestado=" + emprestado + '}';
    }
}
    
    
