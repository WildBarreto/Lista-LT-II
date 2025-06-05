package Questão03;

public class Main {
    public static void main(String[] args) {
      
        Aluno aluno1 = new Aluno();

     
        Aluno aluno2 = new Aluno("Lucin Eloi", "20231234", "Engenharia da Computação");

        System.out.println("Aluno 1 (Construtor sem parametros)");
        aluno1.mostrarDados();

        System.out.println("\nAluno 2 (Construtor com parametros)");
        aluno2.mostrarDados();
    }
}
