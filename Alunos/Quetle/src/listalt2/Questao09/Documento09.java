package listalt2.Questao09;

public abstract class Documento09 {
    protected String titulo;

    public Documento09(String titulo) {
        this.titulo = titulo;
    }
    
   public abstract void abrir();
   
   public String getTitulo(){
       return titulo;
   }
}
