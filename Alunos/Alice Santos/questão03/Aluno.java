package questão03;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("NOME: " + nome);
        System.out.println("MATRÍCULA: " + matricula);
        System.out.println("CURSO: " + curso);
    }
}