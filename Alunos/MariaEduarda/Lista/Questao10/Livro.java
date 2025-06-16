package Lista.Questao10;

public class Livro {
    
    String titulo;
    String autor;
    String isbn;
    boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public String info() {
        return titulo + " | " + autor + " | ISBN: " + isbn + " | Emprestado: " + emprestado;
    }
}

