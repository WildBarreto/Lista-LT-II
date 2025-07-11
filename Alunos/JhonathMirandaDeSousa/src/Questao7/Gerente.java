package Questao7;

/**
 * Representa um gerente, que é um funcionário com bônus adicional.
 * Estende a classe Funcionario e inclui o cálculo do salário total com bônus.
 * 
 * @author jjhon
 */
public class Gerente extends Funcionario {
    private double bonus;

    /**
     * Construtor para criar um gerente com nome, CPF, salário base e bônus.
     * 
     * @param nome Nome do gerente.
     * @param cpf CPF do gerente.
     * @param salarioBase Salário base do gerente.
     * @param bonus Valor do bônus do gerente.
     */
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    /** Retorna o valor do bônus do gerente. */
    public double getBonus() {
        return bonus;
    }

    /**
     * Calcula o salário total do gerente somando salário base e bônus.
     * 
     * @return salário total.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    /**
     * Retorna a representação em string do gerente, incluindo o bônus e salário total.
     * 
     * @return dados do gerente formatados.
     */
    @Override
    public String toString() {
        return super.toString() 
            + ", Bônus: R$" + String.format("%.2f", bonus) 
            + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
