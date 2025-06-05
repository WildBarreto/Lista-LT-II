package Questão09;

public class Relatorio extends Documento {

    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo relatório: " + titulo);
    }
}
