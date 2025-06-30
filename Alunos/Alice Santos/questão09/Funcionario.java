package questão09;

public class Funcionario implements Imprimivel {
    private final String nome;
    private final String cpf;
    private final double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("FUNCIONÁRIO:");
        System.out.println("NOME: " + nome.toUpperCase());
        System.out.println("CPF: " + cpf.toUpperCase());
        System.out.println("SALÁRIO: R$ " + salario);
    }
}