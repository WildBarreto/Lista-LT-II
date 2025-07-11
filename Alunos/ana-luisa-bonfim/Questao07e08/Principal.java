/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao07e08;

import java.util.ArrayList;

/**
 *
 * @author analu
 */
public class Principal {
    public static void main(String[] args){
    
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlinhos", "111.111.111-11", 2000));
        funcionarios.add(new Gerente("Joana", "222.222.222-22", 5000, 1800));
        funcionarios.add(new Vendedor("Joaozinho", "333.333.333-33", 2000, 800));

        System.out.println("--- Lista de funcionarios ---");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
