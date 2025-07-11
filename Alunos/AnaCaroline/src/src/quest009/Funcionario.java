package quest009;

public class Funcionario implements Imprimivel {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionário: " + nome);
    }
}
