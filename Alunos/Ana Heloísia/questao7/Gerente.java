package AnaHeloisia4info.questao7;

public class Gerente extends Funcionario {
    
    double bonus;
    
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
