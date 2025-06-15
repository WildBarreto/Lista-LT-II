package Questão_Três;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    
   public Aluno(){
         this.nome = "Nameless";
         this.matricula = 0;
         this.curso = "Null";
    }
   public Aluno(String nome, int matricula, String curso){
       this.nome = nome;
       this.matricula = matricula;
       this.curso = curso;
   }
public void mostrarDados(){
   System.out.println("Nome: " + nome + " Matricula: " + matricula + " Curso: " + curso);
   }
}
