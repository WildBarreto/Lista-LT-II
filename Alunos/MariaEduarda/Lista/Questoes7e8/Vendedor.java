package Lista.Questoes7e8;

public class Vendedor extends Funcionario {
    
    double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        System.out.println(nome + " - Salario com comissao: R$" + (salarioBase + comissao));
    }
}

