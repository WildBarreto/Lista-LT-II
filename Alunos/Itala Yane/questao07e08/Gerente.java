/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao07e08;

/**
 *
 * @author curso
 */
public class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome, String cpf, double salariobase, double bonus) {
        super(nome, cpf, salariobase);
        this.bonus = bonus;
    }
    
    public double calcularSalario(){
    return salariobase + bonus;
    }
    
    
}
