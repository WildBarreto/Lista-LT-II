package questao07;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cep, double salarioBase, double comissao) {
        super(nome, cep, salarioBase);

        this.comissao = comissao;
    }

    public Vendedor() {super();}

    public double getComissao() {
        return comissao;
    }

    public void seComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("-----------------------------------\n");
        s.append(super.toString());
        s.append("Comissao: R$ " + comissao + "\n");
        s.append("Salario Final: R$ " + calcularSalario() + "\n");
        s.append("-----------------------------------\n");

        return s.toString();
    }
}
