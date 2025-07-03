/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao07e08;

/**
 *
 * @author curso
 */
public class Vendedor extends Funcionario {
    double comissao;

    
    public Vendedor(String nome, String cpf, double salariobase, double comissao) {
        super(nome, cpf, salariobase);
        this.comissao = comissao;
    }
    
    public double calcularSalario(){
    return salariobase + comissao;
    }
    
    
    
}
