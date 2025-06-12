package AnaHeloisia4info.questao7;

public class Funcionario {
   
    String nome;
    String cpf;
    double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario (){
       
        return salarioBase;
        
    }
    
}   

