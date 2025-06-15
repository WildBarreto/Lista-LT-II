package Questao8;

/**
 * Representa um vendedor, que é um tipo de funcionário que recebe comissão sobre vendas.
 */
public class Vendedor extends Funcionario {
    private double comissao;
    private double totalVendas;

    /**
     * Construtor para inicializar um vendedor com nome, CPF, salário base, comissão e total de vendas.
     * 
     * @param nome Nome do vendedor.
     * @param cpf CPF do vendedor.
     * @param salarioBase Salário base do vendedor.
     * @param comissao Percentual da comissão (ex: 0.05 para 5%).
     * @param totalVendas Valor total das vendas realizadas pelo vendedor.
     */
    public Vendedor(String nome, String cpf, double salarioBase, double comissao, double totalVendas) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    /**
     * Retorna o percentual de comissão do vendedor.
     * 
     * @return Percentual da comissão.
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * Retorna o valor total das vendas realizadas pelo vendedor.
     * 
     * @return Total de vendas.
     */
    public double getTotalVendas() {
        return totalVendas;
    }

    /**
     * Calcula o salário total do vendedor, incluindo o salário base mais a comissão sobre as vendas.
     * 
     * @return Salário total calculado.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissao);
    }

    /**
     * Retorna uma string formatada com os dados do vendedor, incluindo comissão, total de vendas e salário total.
     * 
     * @return String com informações detalhadas do vendedor.
     */
    @Override
    public String toString() {
        return super.toString() 
            + ", Comissão: " + String.format("%.2f", comissao * 100) + "%" 
            + ", Total Vendas: R$" + String.format("%.2f", totalVendas) 
            + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
