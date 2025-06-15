package Exercicio07e08;

// Exercício 8 - Polimorfismo com Coleções

import java.util.ArrayList;

public class MainPolimorfismoQuestao08 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

      
        funcionarios.add(new Gerente("Bruno", "555.555.555-55", 6000, 1200));
        funcionarios.add(new Vendedor("Camila", "666.666.666-66", 2500, 700));
        funcionarios.add(new Vendedor("Diego", "777.777.777-77", 2700, 650));
        funcionarios.add(new Gerente("Elaine", "888.888.888-88", 5800, 1800));

       
        System.out.println(">>> LISTA DE SALARIOS CALCULADOS (Polimorfismo) <<<");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getDados());
        }
    }
}
    
