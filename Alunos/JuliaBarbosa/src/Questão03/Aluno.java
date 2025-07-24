package Questão03;


public class Aluno {
   
    private String nome;
    private String matricula;
    private String curso;

    
    public Aluno() {
        this.nome = "Joaquim";
        this.matricula = "0022";
        this.curso = "Artes cenicas";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("---------------");
    }
}


