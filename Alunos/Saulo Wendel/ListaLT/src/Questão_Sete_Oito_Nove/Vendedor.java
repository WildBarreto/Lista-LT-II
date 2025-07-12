package Questão_Sete_Oito_Nove;


import Questão_Sete_Oito_Nove.Funcionario;

public class Vendedor extends Funcionario {
    String nome;
    int cpf,  salarioBase, comissao = 20;
    
    public Vendedor(String nome, int cpf, int salarioBase){
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }
      
    
    @Override
    public int CalcSalario(){
        return super.CalcSalario() + (comissao * 10);
    }
}
