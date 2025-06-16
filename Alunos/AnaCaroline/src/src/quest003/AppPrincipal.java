package quest003;

public class AppPrincipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "123456", "Java");
        aluno1.mostrarDados();

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setMatricula("654321");
        aluno2.setCurso("Python");
        aluno2.mostrarDados();
    }
}
