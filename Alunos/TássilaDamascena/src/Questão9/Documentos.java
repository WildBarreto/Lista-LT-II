
package Questão9;

abstract class Documento {
    
    String titulo;

    Documento(String titulo) {
        
        this.titulo = titulo;
    }

    abstract void abrir();
}
    
    

