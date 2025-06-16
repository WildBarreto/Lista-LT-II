package l.t.pkg2;

public class Vendedor extends Funcionario {
    private double comissao;

public Vendedor() {}

    public Vendedor(double comissao, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

}
