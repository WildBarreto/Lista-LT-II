/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao07e08;

/**
 *
 * @author curso
 */
public class Funcionario {
    
    String nome;
    String cpf;
    double salariobase;

    public Funcionario(String nome, String cpf, double salariobase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salariobase = salariobase;
    }
    
    public double calcularSalario(){
    return salariobase;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario: " +calcularSalario() + '}';
    }

    
    

}
