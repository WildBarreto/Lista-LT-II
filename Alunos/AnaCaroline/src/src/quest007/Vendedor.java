package quest007;

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
}

