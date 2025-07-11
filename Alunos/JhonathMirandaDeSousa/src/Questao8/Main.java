package Questao8;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal para demonstrar o uso de polimorfismo em uma coleção
 * de objetos do tipo Funcionario, Gerente e Vendedor.
 */
public class Main {

    /**
     * Método principal que cria uma lista de funcionários e imprime os salários calculados.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João Silva", "111.111.111-11", 3000.00));
        funcionarios.add(new Gerente("Maria Souza", "222.222.222-22", 5000.00, 1500.00));
        funcionarios.add(new Vendedor("Carlos Oliveira", "333.333.333-33", 2000.00, 0.05, 10000.00));
        funcionarios.add(new Gerente("Ana Costa", "444.444.444-44", 6000.00, 2000.00));
        funcionarios.add(new Vendedor("Fernanda Lima", "555.555.555-55", 2200.00, 0.08, 8000.00));

        System.out.println("Salários Calculados dos Funcionários (Polimorfismo com Coleções):");
        System.out.println("--------------------------------------------------------------");

        for (Funcionario f : funcionarios) {
            System.out.printf(
                "Nome: %-20s | Cargo: %-10s | Salário Calculado: R$ %.2f%n",
                f.getNome(),
                f.getClass().getSimpleName(),
                f.calcularSalario()
            );
        }
    }
}
