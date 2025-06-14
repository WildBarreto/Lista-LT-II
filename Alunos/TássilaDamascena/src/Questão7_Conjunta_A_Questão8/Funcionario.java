
package Questão7_Conjunta_A_Questão8;


public class Funcionario {
    
    String nome;
    String cpf;
    double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase){
    
    this.nome = nome;
    this.cpf =  cpf;
    this.salarioBase = salarioBase;
    
    }
    
    public double calcularSalario(){
        
    return salarioBase;
    }
    
    public void exibirSalario(){
    
        System.out.println(nome + " _Salario: " +calcularSalario());
    
    }
  
}
