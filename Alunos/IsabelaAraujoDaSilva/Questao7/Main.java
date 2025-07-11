package Questao7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ana Silva", "111.222.333-44", 5000.00, 1500.00));
        funcionarios.add(new Vendedor("Bruno Costa", "555.666.777-88", 2000.00, 800.00));
        funcionarios.add(new Gerente("Carlos Dantas", "999.888.777-66", 6000.00, 2000.00));
        funcionarios.add(new Vendedor("Diana Rocha", "123.456.789-00", 2500.00, 1000.00));

        System.out.println("Salários Calculados dos Funcionários:");
        System.out.println("-------------------------------------");

        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %-20s | Cargo: %-10s | Salário Calculado: R$ %.2f%n",
                    f.getNome(),
                    f.getClass().getSimpleName(),
                    f.calcularSalario());
        }
    }
}
