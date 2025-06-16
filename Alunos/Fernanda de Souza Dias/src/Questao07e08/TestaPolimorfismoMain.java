package Questao07e08;

import java.util.ArrayList;

public class TestaPolimorfismoMain {

    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Gerente());
        lista.add(new Vendedor());

        for (Funcionario f : lista) {
            f.salarioBase = 4000;
            System.out.println("Salário: R$" + f.calcularSalario());
        }
    }
    
}
