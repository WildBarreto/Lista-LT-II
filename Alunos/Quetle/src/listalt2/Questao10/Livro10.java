package listalt2.Questao10;

public class Livro10 {
   private String titulo;
   private String autor;
   private String isbn;
   private boolean emprestado;

    public Livro10(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
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
    public String toString(){
     return "\n Livro{"+
            "\n Titulo: " + titulo +
            "\n Autor: " + autor + 
            "\n ISBN: " + isbn +
            "\n Emprestado: " + emprestado +
            "}";
    }
}

