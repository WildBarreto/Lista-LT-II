package Questao3;

public class MainAluno {
    
    public static void main (String[] args) {
        
        Aluno aluno1 = new Aluno ();
        Aluno aluno2 = new Aluno("Joao", 123, "Informatica"); 
        
        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }
}