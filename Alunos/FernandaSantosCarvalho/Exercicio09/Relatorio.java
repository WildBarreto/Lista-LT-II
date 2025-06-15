package Exercicio09;

/**
 *
 * @author Fernanda Santos
 */
public class Relatorio extends Documento {

    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo relatorio: " + titulo);
    }
}
