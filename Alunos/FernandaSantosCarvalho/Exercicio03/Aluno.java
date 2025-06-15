package Exercicio03;

/**
 *
 * @author Fernanda Santos
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

   
    public Aluno() {
        this.nome = "Sem nome";
        this.matricula = "0000";
        this.curso = "Indefinido";
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
        System.out.println();
    }
}