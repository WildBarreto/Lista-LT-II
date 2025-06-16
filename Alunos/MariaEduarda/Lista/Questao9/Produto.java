package Lista.Questao9;

public class Produto implements Imprimivel {
    
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("Produto: " + nome + " | Preco: R$" + preco);
    }
}

