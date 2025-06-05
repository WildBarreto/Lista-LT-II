package Questão08.Questão08;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nComissão: R$ " + comissao + ", \nSalário Total: R$ " + calcularSalario();
    }
}
