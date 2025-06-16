package quest009;

public abstract class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void abrir();
}
