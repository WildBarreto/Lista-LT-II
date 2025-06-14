
package Questão3;

import java.util.Scanner;

public class Main3 {
    public static void main (String[] args){
    
    Scanner input = new Scanner (System.in);
    
        System.out.println("Aluno 2: ");
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o numero da sua matricula: ");
        String matricula = input.nextLine();
        System.out.println("Digite o seu curso: ");
        String curso = input.nextLine();
        
        Aluno aluno1 = new Aluno ();
        Aluno aluno2 = new Aluno (nome,matricula,curso);
        
        System.out.println("\n\nSeus dados: ");
        
        System.out.println("\nAluno 1: ");
        aluno1.mostrarDados();
        System.out.println("\nAluno 2: ");
        aluno2.mostrarDados();
    
    }
    
}
