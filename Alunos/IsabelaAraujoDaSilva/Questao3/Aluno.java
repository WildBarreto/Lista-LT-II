package Questao3;

class Aluno {
    String nome;
    int matricula;
    String curso;

    public Aluno() {
        this.nome = "Nao informado";
        this.matricula = 0;
        this.curso = "Indefinido";
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("--------------");
    }
}
