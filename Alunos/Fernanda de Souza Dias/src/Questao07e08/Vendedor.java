package Questao07e08;

public class Vendedor extends Funcionario {
    double comissao = 1000;

    @Override
    double calcularSalario() {
        return salarioBase + comissao;
    }
}
