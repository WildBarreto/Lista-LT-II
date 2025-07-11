package l.t.pkg2;

public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;
    
    //sem parâmetro
    public Aluno() {
        this.nome = "Sem nome";
        this.matricula = "0000";
        this.curso = "Indefinido";
    }

    //com parâmetro
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void exibirDados(){
        System.out.println("Nome do aluno:" + nome);
        System.out.println("Numero da matricula:" + matricula);
        System.out.println("Curso matriculado:" + curso);
        System.out.println("__________________________");
    }
    
}
