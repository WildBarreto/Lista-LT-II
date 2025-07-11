package questao09;

public abstract class Documento {
    private String titulo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract void abrir();
}
