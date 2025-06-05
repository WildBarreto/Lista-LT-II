package Questão07;

import Questão08.Questão08.Vendedor;
import Questão08.Questão08.Funcionario;
import Questão08.Questão08.Gerente;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Lucin jr", "123.456.789-00", 5000.00, 1500.00));
        funcionarios.add(new Vendedor("Luciano junior", "987.654.321-00", 3000.00, 800.00));
        funcionarios.add(new Funcionario("Junior Eloi", "111.222.333-44", 2500.00));

        System.out.println("Lista de Funcionários");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
