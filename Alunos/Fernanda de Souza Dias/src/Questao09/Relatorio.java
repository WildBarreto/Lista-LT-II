package Questao09;

public class Relatorio extends Documento {
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Relatório: " + titulo);
    }
}
