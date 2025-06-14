package Questao07e08;

public class Gerente extends Funcionario {
    double bonus = 2000;

    @Override
    double calcularSalario() {
        return salarioBase + bonus;
    }
}
