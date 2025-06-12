package questao08;

import java.util.ArrayList;
import questao07.*;

public class AppMain {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Kaio Menandro", "195.31.432-11", 6200.0, 1200.0));
        funcionarios.add(new Vendedor("Wild Barreto", "912.452.252-22", 3110.0, 1200.0));
        funcionarios.add(new Vendedor("Anna Clara", "233.754.333-03", 2880.0, 1040.0));
        funcionarios.add(new Gerente("Ancelmo", "099.696.444-05", 6200.0, 1800.0));

        for(Funcionario f : funcionarios) {
            System.out.println("Salario final do funcionario " + (funcionarios.indexOf(f) + 1) + ": R$ " + f.calcularSalario() + "\n");
        }
    }
}
