package questão03;

public class Principal {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();

        Aluno aluno2 = new Aluno("ALICE SANTOS", "20211IREINFINT0001", "INFORMÁTICA");

        System.out.println("DADOS DO DISCENTE 01: ");
        aluno1.exibirDados();

        System.out.println("\nDADOS DO DISCENTE 02: ");
        aluno2.exibirDados();
    }
}