package Questão_Sete_Oito_Nove;

public class Funcionario implements Imprimivel {
    String nome;
    int cpf,  salarioBase;
    
    public Funcionario(String nome, int cpf, int salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nome: " + nome + " Cpf: " + cpf);
    }
    @Override
    public String toString(){
        return  nome + "  Cpf: " + cpf;
    }
    
    public int CalcSalario(){
        return salarioBase;
    }
}
