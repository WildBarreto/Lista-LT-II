package listalt2.Questao07_08;


import listalt2.Questao07_08.Funcionario07;

public class Vendedor07 extends Funcionario07{
    private double comissao;
    
    public Vendedor07(String nome, String cpf, double salarioBase,double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + comissao;
    }
    
    @Override
    public String toString(){
       return super.toString()+ ", Comissão: " +comissao+ "Vendedor";
    }
}
