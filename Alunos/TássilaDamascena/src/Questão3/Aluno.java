
package Questão3;


public class Aluno {
    
    String nome;
    String matricula;
    String curso;
    
    
    public Aluno(){
    
    this.nome = "";
    this.matricula = "";
    this.curso = ""; 
    
    }
    
    public Aluno (String nome, String matricula, String curso){
    
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;

    }
    
    public void mostrarDados(){
    
        System.out.println("Nome: " +nome);
        System.out.println("Matricula: " +matricula);
        System.out.println("Curso: " +curso);
    
    }
}
