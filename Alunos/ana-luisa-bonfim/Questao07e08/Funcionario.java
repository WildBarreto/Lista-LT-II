/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao07e08;

/**
 *
 * @author analu
 */
public class Funcionario {
    String nome;
    String CPF;
    double salarioBase;
    
    public Funcionario(String nome, String CPF, double salarioBase) {
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }
    
    @Override
    public String toString() {
        return "Nome: " +nome + "\nCPF: " +CPF + "\nSalario: " +calcularSalario()+ " R$\n";
    }
    
}
