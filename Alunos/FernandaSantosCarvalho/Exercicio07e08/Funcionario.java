package Exercicio07e08;

/**
 *
 * @author Fernanda Santos
 */
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

    public String getDados() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Salario: R$ " + calcularSalario();
    }
}