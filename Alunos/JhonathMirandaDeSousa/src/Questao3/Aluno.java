package Questao3;

class Aluno {
    // Atributos
    String nome;
    int matricula;
    String curso;

    // Construtor sem parâmetros
    public Aluno() {
        this.nome = "Nao informado";
        this.matricula = 0;
        this.curso = "Indefinido";
    }

    // Construtor com parâmetros
    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Método para mostrar os dados
    public void mostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("--------------");
    }
}
