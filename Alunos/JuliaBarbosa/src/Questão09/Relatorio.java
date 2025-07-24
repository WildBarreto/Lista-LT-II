package Questão09;

import Questão09.Documento;

public class Relatorio extends Documento {
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Relatório: " + titulo);
    }
}
