package Questão07e08;


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

    public void exibirSalario() {
        System.out.println(nome + " - Salário: R$ " + calcularSalario());
    }
}
