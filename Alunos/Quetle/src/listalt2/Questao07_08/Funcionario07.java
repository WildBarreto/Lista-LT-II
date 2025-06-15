package listalt2.Questao07_08;

public class Funcionario07 {
 public String nome;
 public String cpf;
 public double salarioBase;

    public Funcionario07(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
 public double calcularSalario(){
    return salarioBase; 
 }
 
 @Override
 public String toString(){
     return "Nome: "+ nome + ", CPF: "+cpf+ ", Salário Base: "+salarioBase; 
 }
}
