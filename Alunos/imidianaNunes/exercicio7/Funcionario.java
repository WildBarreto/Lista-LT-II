package exercicio7;

import exercicio9.Imprimivel;

/**
 *
 * @author imidi
 */
public class Funcionario implements Imprimivel {
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
        return "Nome: " + nome + " | CPF: " + cpf + " | Salario: R$ " + calcularSalario();
    }
    
    @Override
public void imprimir() {
    System.out.println(toString()); // Reutiliza o toString
    
}
}