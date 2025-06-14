
package Questão7_Conjunta_A_Questão8;

 
public class Gerente extends Funcionario {
        
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
    
  
