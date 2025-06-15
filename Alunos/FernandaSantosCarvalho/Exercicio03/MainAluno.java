package Exercicio03;

/**
 *
 * @author Fernanda Santos
 */
public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); 
        Aluno aluno2 = new Aluno("Eduardo Silva", "98765", "Medicina"); 

        System.out.println("\n   Aluno 1: \n");
        aluno1.mostrarDados();

        System.out.println("\n   Aluno 2: \n");
        aluno2.mostrarDados();
    }
}

