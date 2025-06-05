package Questão08.Questão08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Lucin Jr", "123.456.789-00", 5000.00, 1500.00));
        funcionarios.add(new Vendedor("Luciano Junior", "987.654.321-00", 3000.00, 800.00));
        funcionarios.add(new Funcionario("Junior Eloi", "111.222.333-44", 2500.00));
        funcionarios.add(new Vendedor("Paula Mendes", "999.888.777-66", 3200.00, 1000.00));
        funcionarios.add(new Gerente("Roberto Carlos", "555.666.777-88", 6000.00, 2000.00));

        System.out.println("=== Lista de Funcionários e Salários Calculados ===");
        for (Funcionario f : funcionarios) {          
            String tipo = f.getClass().getSimpleName();

            System.out.println(tipo + " - " + f.nome + " | Salário Calculado: R$ " + f.calcularSalario());
        }
    }
}

