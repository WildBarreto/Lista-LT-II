package Questao8;

/**
 * Representa um funcionário com nome, CPF e salário base.
 * Fornece métodos para acessar seus dados e calcular o salário.
 * 
 * @author jjhom
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    /**
     * Construtor que inicializa os dados do funcionário.
     * 
     * @param nome Nome completo do funcionário.
     * @param cpf CPF do funcionário.
     * @param salarioBase Valor do salário base do funcionário.
     */
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna o nome do funcionário.
     * 
     * @return Nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o CPF do funcionário.
     * 
     * @return CPF do funcionário.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Retorna o salário base do funcionário.
     * 
     * @return Salário base.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Calcula o salário do funcionário.
     * Neste caso, retorna apenas o salário base, mas pode ser sobrescrito por subclasses.
     * 
     * @return Valor do salário calculado.
     */
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Retorna uma representação em texto do funcionário com seus dados.
     * 
     * @return String formatada com nome, CPF e salário base.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Salário Base: R$" + String.format("%.2f", salarioBase);
    }
}
