
package Questão9;


class Carta extends Documento {
    
    Carta(String titulo) {
        super(titulo);
    }

    void abrir() {
        System.out.println("Abrindo carta: " + titulo);
    }
}
    

