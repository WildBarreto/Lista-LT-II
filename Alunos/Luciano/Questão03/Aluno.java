package Questão03;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        this.nome = "Luciano Junior";
        this.matricula = "0009";
        this.curso = "Informatica";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

