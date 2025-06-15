package listalt2.Questao09;


import listalt2.Questao09.Imprimivel09;

public class Produto09 implements Imprimivel09{
    private String nome;
    private double preco;

    public Produto09(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("Produto: " +nome+ ", Preço: R$" +preco);
    }    
}
