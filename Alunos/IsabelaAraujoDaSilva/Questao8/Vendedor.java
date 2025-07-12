package Questao8;

public class Vendedor extends Funcionario {
    private double comissao;
    private double totalVendas;

    public Vendedor(String nome, String cpf, double salarioBase, double comissao, double totalVendas) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
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
