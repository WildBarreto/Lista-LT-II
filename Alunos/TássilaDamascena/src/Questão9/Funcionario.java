
package Questão9;

class Funcionario implements Imprimivel {
    
String nome;
double salario;

Funcionario(String nome, double salario) {
        
    this.nome = nome;
    this.salario = salario;
}

    public void imprimir() {
        System.out.println("Funcionario: " + nome + " - Salario: " + salario);
    }
}
    
