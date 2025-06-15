package Questao7;

/**
 * Representa um funcionário com nome, CPF e salário base.
 * Fornece métodos para acessar os atributos e calcular o salário.
 * 
 * @author jjhon
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    /**
     * Construtor para inicializar um funcionário.
     * 
     * @param nome Nome completo do funcionário.
     * @param cpf CPF do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    /** Retorna o nome do funcionário. */
    public String getNome() {
        return nome;
    }

    /** Retorna o CPF do funcionário. */
    public String getCpf() {
        return cpf;
    }

    /** Retorna o salário base do funcionário. */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Calcula o salário do funcionário.
     * No caso base, retorna apenas o salário base.
     * Pode ser sobrescrito em subclasses para cálculos específicos.
     * 
     * @return salário calculado.
     */
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Retorna a representação em String do funcionário.
     * 
     * @return dados do funcionário formatados.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Salário Base: R$" + String.format("%.2f", salarioBase);
    }
}
