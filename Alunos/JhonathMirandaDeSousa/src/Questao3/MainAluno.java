package Questao3;

public class MainAluno {
    
    public static void main (String[] args) {
        
        //Construtor sem parametros
        Aluno aluno1 = new Aluno ();
        
        //Construtor com parametros
        Aluno aluno2 = new Aluno("Joao", 123, "Informatica"); 
        
        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }
}