package questao03;

public class AppAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.exibirDados();

        Aluno a2 = new Aluno("Victor Hugo", "Tecnico em Informatica", "20211IREINFINT0014");

        a2.exibirDados();
    }
}
