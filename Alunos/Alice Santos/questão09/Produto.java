package questão09;

public class Produto implements Imprimivel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("PRODUTO");
        System.out.println("NOME: " + nome.toUpperCase());
        System.out.println("PREÇO: R$ " + preco);
    }
}