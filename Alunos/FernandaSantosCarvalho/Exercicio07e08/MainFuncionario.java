package Exercicio07e08;

// Exercício 7 - Herança: Funcionário e Subclasses

import java.util.ArrayList;

public class MainFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", "111.111.111-11", 5000, 1500));
        funcionarios.add(new Vendedor("Ana", "222.222.222-22", 3000, 800));
        funcionarios.add(new Vendedor("Joao", "333.333.333-33", 2800, 600));
        funcionarios.add(new Gerente("Luciana", "444.444.444-44", 5500, 2000));

        System.out.println("\n--- SALARIO DOS FUNCIONARIOS ---\n");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getDados());
        }
    }
}

