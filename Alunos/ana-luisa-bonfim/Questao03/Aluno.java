/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao03;

/**
 *
 * @author analu
 */
public class Aluno {
    String nome;
    int matricula;
    String curso;
    
    public Aluno(){
    this.nome = "Ana";
    this.matricula = 12345;
    this.curso = "Informatica";
    }
    
    public Aluno(String nome, int matricula, String curso){
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    }
    
    public void MostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Curso: " +curso + "\n");}
    
}
