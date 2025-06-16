package quest009;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Mainzinho criado para testes 
        ArrayList<Imprimivel> imprimiveis = new ArrayList<>();
        imprimiveis.add(new Produto("Caderno"));
        imprimiveis.add(new Funcionario("João"));

        System.out.println("== Impressões ==");
        for (Imprimivel item : imprimiveis) {
            item.imprimir();
        }

        ArrayList<Documento> documentos = new ArrayList<>();
        documentos.add(new Relatorio("Relatório Anual"));
        documentos.add(new Carta("Carta de Demissão"));

        System.out.println("\n== Abertura de Documentos ==");
        for (Documento doc : documentos) {
            doc.abrir();
        }
    }
}

