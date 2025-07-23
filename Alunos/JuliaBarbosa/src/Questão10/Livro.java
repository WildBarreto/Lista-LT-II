package Questão10;

public class Livro {
    String titulo, autor, isbn;
    boolean emprestado;

    Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
}
