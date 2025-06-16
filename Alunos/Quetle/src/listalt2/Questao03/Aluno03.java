package listalt2.Questao03;

public class Aluno03 {
   public String nome;
   public String matricula;
   public String curso;

    public Aluno03(){
        System.out.println("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIAS E TECNOLOGIA DA BAHIA");
    }
    
    public Aluno03(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void mostrarConstrutor(){
        System.out.println("Construtor sem parâmetros");
    }
    
    public void exibirInformaçãoes(){
        System.out.println("\n Nome: "+ this.nome);
        System.out.println(" Matrícula: "+ this.matricula);
        System.out.println(" Curso: "+ this.curso);
    }
    
    public static void main(String[] args){
         Aluno03 instituto = new Aluno03();
         instituto.mostrarConstrutor();
         System.out.println("\n ___ Contrutor com Parâmetros___");
         Aluno03 aluno1 = new Aluno03("Quetle", "Ireinfint008", "Informática");
         aluno1.exibirInformaçãoes();
         Aluno03 aluno2 = new Aluno03("Maria Antônia", "Ireinfint0010", "Informática");
         aluno2.exibirInformaçãoes();
         Aluno03 aluno3 = new Aluno03("Raquel", "Irebioint000", "Biocombustíveis");
         aluno3.exibirInformaçãoes();
    }
}
