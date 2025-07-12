package Questao8;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() 
                + ", Bônus: R$" + String.format("%.2f", bonus) 
                + ", Salário Total: R$" + String.format("%.2f", calcularSalario());
    }
}
