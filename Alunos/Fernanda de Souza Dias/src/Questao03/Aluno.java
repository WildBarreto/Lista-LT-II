package Questao03;

public class Aluno {
    String nome;
    String matricula;
    String curso;

    Aluno() {
        nome = "Indefinido";
        matricula = "000";
        curso = "Nenhum";
    }

    Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    void mostrar() {
        System.out.println("Aluno: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso);
    }
}
