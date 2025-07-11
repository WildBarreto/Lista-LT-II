package Lista.Questao9;

public class Funcionario implements Imprimivel {
    
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + nome + " | Salario: R$" + salarioBase);
    }
}
