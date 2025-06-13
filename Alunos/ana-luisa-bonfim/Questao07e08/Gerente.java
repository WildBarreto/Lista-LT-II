/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao07e08;

/**
 *
 * @author analu
 */
public class Gerente extends Funcionario {
    double bonus;
    
    public Gerente(String nome, String CPF, double salarioBase, double bonus){
    super(nome, CPF, salarioBase);
    this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }
    
}
