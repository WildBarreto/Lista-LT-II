package questão08;

public class Gerente extends Funcionario {
    private final double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
