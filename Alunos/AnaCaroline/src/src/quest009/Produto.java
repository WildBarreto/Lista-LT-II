package quest009;

public class Produto implements Imprimivel {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("Produto: " + nome);
    }
}
