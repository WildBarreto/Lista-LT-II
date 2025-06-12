package ListaLT2;

import java.util.ArrayList;

public class Questao8 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Wild", "111.111.111-11", 8000, 1000));
        funcionarios.add(new Vendedor("Icaro", "222.222.222-22", 0, 100));
        funcionarios.add(new Vendedor("Lucianjo", "333.333.333-33", 1000, 10));

        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + " - Salario: R$ " + f.calcularSalario());
        }
    }
}