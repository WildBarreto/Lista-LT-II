package l.t.pkg2;

public abstract class Documento {
    protected String titulo;
    
    public Documento(){
        
    }

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract void abrir();
}
