package q3.aluno;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        this.nome = "Wild";
        this.matricula = "10252";
        this.curso = "eng de pesca";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        System.out.println("Aluno 1 - Dados padrao:");
        aluno1.mostrarDados();
        
        System.out.println();
        
        Aluno aluno2 = new Aluno("Lucas", "2024001", "Informatica");
        System.out.println("Aluno 2 - Dados completos:");
        aluno2.mostrarDados();
    }
}
