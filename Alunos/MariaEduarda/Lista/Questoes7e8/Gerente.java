package Lista.Questoes7e8;

public class Gerente extends Funcionario {
    
    double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        System.out.println(nome + " - Salario com bonus: R$" + (salarioBase + bonus));
    }
}

