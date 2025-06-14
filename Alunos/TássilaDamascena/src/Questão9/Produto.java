package Questão9;

class Produto implements Imprimivel {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("Produto: " + nome + " - Preco: " + preco);
    }
}
