package listalt2.Questao07_08;


import listalt2.Questao07_08.Funcionario07;

public class Gerente07 extends Funcionario07{
    private double bonus;
    
    public Gerente07(String nome, String cpf, double salarioBase,double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
      return salarioBase + bonus;   
}
    @Override
    public String toString(){
        return super.toString()+ ", Bonus: " + bonus + "Gerente";
    }
}
