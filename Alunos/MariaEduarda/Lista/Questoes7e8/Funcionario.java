package Lista.Questoes7e8;

public class Funcionario {
    
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println(nome + " - Salario: R$" + salarioBase);
    }
}
