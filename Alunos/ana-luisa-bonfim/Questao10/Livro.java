/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

/**
 *
 * @author analu
 */
public class Livro {
    public String titulo;
    public String autor;
    public String isbn;
    public boolean emprestado;

    public Livro(String titulo, String autor, String isbn, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public boolean Emprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public String getInfo() {
        return titulo + " - " +autor + " (ISBN: " +isbn + ")";
    }
    
}
