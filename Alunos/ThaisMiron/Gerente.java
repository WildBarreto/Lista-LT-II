package l.t.pkg2;

    
public class Gerente extends Funcionario {
    private double bonus;

public Gerente() {}

    public Gerente(double bonus, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
    
}
