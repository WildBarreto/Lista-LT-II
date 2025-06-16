package Questao8;

/**
 * Representa um gerente, que é um tipo de funcionário que recebe um bônus além do salário base.
 * Estende a classe Funcionario e sobrescreve o cálculo de salário para incluir o bônus.
 * 
 */
public class Gerente extends Funcionario {
    private double bonus;

    /**
     * Construtor para inicializar um gerente com nome, CPF, salário base e bônus.
     * 
     * @param nome Nome do gerente.
     * @param cpf CPF do gerente.
     * @param salarioBase Salário base do gerente.
     * @param bonus Valor do bônus adicional do gerente.
     */
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    /**
     * Retorna o valor do bônus do gerente.
     * 
     * @return Valor do bônus.
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Calcula o salário total do gerente, somando o salário base e o bônus.
     * 
     * @return Salário total do gerente.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    /**
     * Retorna uma string formatada com os dados do gerente, incluindo bônus e salário total.
     * 
     * @return String com informações detalhadas do gerente.
     */
    @Override
    public String toString() {
        return super.toString() 
                + ", Bônus: R$" + String.format("%.2f", bonus) 
                + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
