package exercicio9;

import exercicio9.Relatorio;
import exercicio9.Produto;
import exercicio9.Carta;
import exercicio9.Documento;
import exercicio9.Imprimivel;
import exercicio7.Funcionario;
import java.util.ArrayList;

public class MainFinal {
    public static void main(String[] args) {
        // Teste da interface Imprimivel
        Imprimivel p = new Produto("Camiseta", 49.99);
        Imprimivel f = new Funcionario("Lucas", "123.456.789-00", 3000);

        p.imprimir();
        f.imprimir();

        System.out.println();

        // Teste das classes abstratas
        ArrayList<Documento> documentos = new ArrayList<>();
        documentos.add(new Relatorio("Relatorio Financeiro"));
        documentos.add(new Carta("Carta de Apresentacao"));

        for (Documento d : documentos) {
            d.abrir();
        }
    }
}
