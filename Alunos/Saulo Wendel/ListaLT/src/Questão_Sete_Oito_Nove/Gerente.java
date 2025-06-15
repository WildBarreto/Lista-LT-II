package Questão_Sete_Oito_Nove;


import Questão_Sete_Oito_Nove.Funcionario;

public class Gerente extends Funcionario {
  String nome;
    int cpf,  salarioBase, bonus = 500;
    
    public Gerente(String nome, int cpf, int salarioBase){
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }
    
    
    @Override
    public int CalcSalario(){
        return super.CalcSalario() + bonus;
    }  
}
