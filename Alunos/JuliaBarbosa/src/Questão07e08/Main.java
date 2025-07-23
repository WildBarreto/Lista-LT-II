package Questão07e08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        
        funcionarios.add(new Gerente("Julia Barbosa", "111.222.333-44", 2000, 1500));
        funcionarios.add(new Vendedor("Ela Barbosa", "555.666.777-88", 2000, 800));
        
        for (Funcionario f : funcionarios) {
            f.exibirSalario();
        }
    }
}
