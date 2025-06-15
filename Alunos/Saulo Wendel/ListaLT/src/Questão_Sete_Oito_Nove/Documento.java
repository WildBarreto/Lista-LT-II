package Questão_Sete_Oito_Nove;

public abstract class Documento {
    String titulo;
    
    public Documento(String titulo){
        this.titulo = titulo;
    }
    
    public abstract void abrir();
    
}
