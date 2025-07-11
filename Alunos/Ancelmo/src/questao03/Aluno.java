package questao03;

public class Aluno {
    private String nome;
    private String curso;
    private String matricula;


    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void exibirDados() {
        System.out.println("---------------------------------------------------");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("---------------------------------------------------");
    }
    
}
