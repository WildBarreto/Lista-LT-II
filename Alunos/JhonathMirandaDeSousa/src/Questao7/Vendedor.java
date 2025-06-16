package Questao7;

/**
 * Representa um vendedor, funcionário que recebe comissão sobre suas vendas.
 * Extende a classe Funcionario e inclui cálculo de salário com base em comissão.
 * 
 * @author jjhon
 */
public class Vendedor extends Funcionario {
    private double comissao;     // Comissão por venda (exemplo: 0.10 para 10%)
    private double totalVendas;  // Total em valor das vendas realizadas

    /**
     * Construtor para inicializar o vendedor.
     * 
     * @param nome Nome do vendedor.
     * @param cpf CPF do vendedor.
     * @param salarioBase Salário base do vendedor.
     * @param comissao Percentual da comissão (ex: 0.10 = 10%).
     */
    public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
        this.totalVendas = 0.0; // Inicializa com zero, pois vendas começam vazias
    }

    /** Retorna o percentual da comissão. */
    public double getComissao() {
        return comissao;
    }

    /** Retorna o total em vendas. */
    public double getTotalVendas() {
        return totalVendas;
    }

    /**
     * Atualiza o total de vendas somando o valor informado.
     * 
     * @param valorVenda valor da venda a ser adicionada.
     */
    public void adicionarVenda(double valorVenda) {
        if (valorVenda > 0) {
            this.totalVendas += valorVenda;
        }
    }

    /**
     * Calcula o salário total somando o salário base com a comissão sobre as vendas.
     * 
     * @return salário total.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissao);
    }

    /**
     * Retorna a representação em String do vendedor.
     * 
     * @return dados do vendedor formatados.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Comissão: " + String.format("%.2f", comissao * 100) + "%"
                + ", Total Vendas: R$" + String.format("%.2f", totalVendas)
                + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
