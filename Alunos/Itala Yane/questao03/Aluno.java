/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

import java.util.Scanner;


public class Aluno {
    //Crie a classe Aluno com nome, matrícula e curso.
    private String aluno;
    private String matricula;
    private String curso;

    public Aluno(String aluno, String matricula, String curso) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public Aluno() {
        this.aluno = "Ana";
        this.matricula = "0015";
        this.curso = "Informatica";
    }
    
   
    public void exibirDados(){
        System.out.println("\nNome: " +aluno + "\nMatricula: " +matricula + "\nCurso: " +curso);}
    
    public static void main(String[] args){
        
    Scanner ler = new Scanner(System.in);   
     
    System.out.println("Informe o nome do primeiro aluno: ");
    String aluno1 = ler.nextLine();
        
    System.out.println("Informe a matricula do primeiro aluno: ");
    String matricula = ler.nextLine();
    
    System.out.println("Informe o curso do primeiro aluno: ");
    String curso = ler.nextLine();
    
    Aluno Aluno1= new Aluno(aluno1, matricula, curso);
    
     Aluno Aluno2 = new Aluno();
     
     Aluno1.exibirDados();
     Aluno2.exibirDados();
    
     
    
    }
    
    
}
    
    
    
    
    
    
    
    

