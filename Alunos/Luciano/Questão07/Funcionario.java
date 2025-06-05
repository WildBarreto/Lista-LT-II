package Questão07;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "\n\nNome: " + nome + ", \nCPF: " + cpf + ", \nSalário Base: R$ " + salarioBase;
    }
}
