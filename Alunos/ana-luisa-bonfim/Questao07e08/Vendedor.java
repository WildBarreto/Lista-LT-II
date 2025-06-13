/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao07e08;

/**
 *
 * @author analu
 */
public class Vendedor extends Funcionario{
    double comissao;
    
    public Vendedor(String nome, String CPF, double salarioBase, double comissao){
    super(nome, CPF, salarioBase);
    this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + comissao;
    }
    
}
