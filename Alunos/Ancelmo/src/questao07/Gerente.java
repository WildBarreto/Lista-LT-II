package questao07;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cep, double salarioBase, double bonus) {
        super(nome, cep, salarioBase);

        this.bonus = bonus;
    }

    public Gerente() {super();}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("-----------------------------------\n");
        s.append(super.toString());
        s.append("Bonus: R$ " + bonus + "\n");
        s.append("Salario Final: R$" + calcularSalario() + "\n");
        s.append("-----------------------------------\n");

        return s.toString();
    }
}
