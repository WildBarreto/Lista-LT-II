package Questao7;

public class Vendedor extends Funcionario {
    private double comissao;     
    private double totalVendas;

    public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
        this.totalVendas = 0.0; 
    }

    public double getComissao() {
        return comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void adicionarVenda(double valorVenda) {
        if (valorVenda > 0) {
            this.totalVendas += valorVenda;
        }
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissao);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Comissão: " + String.format("%.2f", comissao * 100) + "%"
                + ", Total Vendas: R$" + String.format("%.2f", totalVendas)
                + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
