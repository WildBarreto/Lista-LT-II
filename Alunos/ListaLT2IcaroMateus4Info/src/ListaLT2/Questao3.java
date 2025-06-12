package ListaLT2;


public class Questao3 {
    public static void main(String[] args) {
        // Aluno com construtor sem parâmetros
        Aluno aluno1 = new Aluno();
        System.out.println("Aluno 1:");
        aluno1.mostrarDados();

        // Aluno com construtor com parâmetros
        Aluno aluno2 = new Aluno("Maria Oliveira", "202501234", "Engenharia Civil");
        System.out.println("\nAluno 2:");
        aluno2.mostrarDados();
    }
}

class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    // Construtor sem parâmetros
    public Aluno() {
        this.nome = "Default";
        this.matricula = "000000";
        this.curso = "Nao registrado";
    }

    // Construtor com parâmetros
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
}