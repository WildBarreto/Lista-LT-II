package exercicio9;

import exercicio9.Imprimivel;

/**
 *
 * @author imidi
 */
public class Produto implements Imprimivel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("Produto: " + nome + " | Preco: R$ " + preco);
    }
    
}
