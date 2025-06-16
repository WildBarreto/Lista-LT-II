package l.t.pkg2;

public class AlunoPrincipal {
    
    public static void main(String[] args){
        
        //sem parâmetro
        Aluno aluno1 = new Aluno();
        
        //com parâmetro
        Aluno aluno2 = new Aluno("Thais", "20394781", "Informatica");
        
        System.out.println("__________DADOS DOS ALUNOS__________");
        aluno1.exibirDados();
        aluno2.exibirDados();
        
        
        System.out.println("___________Aluno 1___________");
        System.out.println("Nome Completo: " + aluno1.getNome());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());
        
        System.out.println("___________Aluno 2___________");
        System.out.println("Nome Completo: " + aluno2.getNome());
        System.out.println("Matricula: " + aluno2.getMatricula());
        System.out.println("Curso: " + aluno2.getCurso());
    }
    }

