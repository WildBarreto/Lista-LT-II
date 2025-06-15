
package Questão9;

class Relatorio extends Documento {
    
    Relatorio(String titulo) {
        super(titulo);
    }

    void abrir() {
        System.out.println("Abrindo relatorio: " + titulo);
    }
}
    

