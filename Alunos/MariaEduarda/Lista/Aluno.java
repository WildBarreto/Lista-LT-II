package Lista;

import java.util.Scanner;

public class Aluno {
    
    String nome;
    int matricula;
    String curso;
    
    public Aluno(){
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void mostrarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
    
public static void main(String [] args){
    
    String nome;
    int matricula;
    String curso;
    
    Aluno a;
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nDigite o nome do aluno: ");
    nome = s.next();
    System.out.print("Matricula: ");
    matricula = s.nextInt();
    System.out.print("Curso: ");
    curso = s.next();
    
    Aluno a1 = new Aluno(nome, matricula, curso);
    a1.mostrarDados();
    
    System.out.print("\nDigite o nome do aluno: ");
    nome = s.next();
    System.out.print("Matricula: ");
    matricula = s.nextInt();
    System.out.print("Curso: ");
    curso = s.next();
    
    Aluno a2 = new Aluno(nome, matricula, curso);
    a2.mostrarDados();

}
}
