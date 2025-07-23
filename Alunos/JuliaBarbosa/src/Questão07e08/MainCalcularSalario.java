package Questão07e08;

import java.util.ArrayList;

public class MainCalcularSalario {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        
        funcionarios.add(new Gerente("Julia Barbosa", "111.222.333-44", 2000, 1500));
        funcionarios.add(new Vendedor("Ela Barbosa", "555.666.777-88", 2000, 800));
        
        
        System.out.println("------ Salários dos Funcionários ------");
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            System.out.println("Funcionário: " + f.nome + " | Salário calculado: R$ " + salario);
        }
    }
}

    