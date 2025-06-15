package exercicio3;

import exercicio3.Aluno;

/**
 *
 * @author imidi
 */
public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        Aluno aluno2 = new Aluno("Carlos Silva", "20251234", "Engenharia");

        System.out.println("Aluno 1:");
        aluno1.exibirDados();

        System.out.println("Aluno 2:");
        aluno2.exibirDados();
    }
    
}
