/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

import java.util.Scanner;

/**
 *
 * @author elkin
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        this.nome = "Nome";
        this.matricula = "0000";
        this.curso = "Curso";
    }
    
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("Matricula: ");
        String matricula = ler.nextLine();
        System.out.println("Curso: ");
        String curso = ler.nextLine();
        
        Aluno aluno1 = new Aluno(nome, matricula, curso);
        
        Aluno aluno2 = new Aluno(); 
        
        System.out.println("Aluno 1:");
        aluno1.exibir();
        
        System.out.println("\nAluno 2:");
        aluno2.exibir();
        
    }
    
    
}
