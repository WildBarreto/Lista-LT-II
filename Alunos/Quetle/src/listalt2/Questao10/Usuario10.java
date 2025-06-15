package listalt2.Questao10;

public class Usuario10 {
  private String nome;
  private int id;
  private int livroEmp;

    public Usuario10(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livroEmp = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLivroEmp() {
        return livroEmp;
    }

    public void incrementarLivroEmp() {
        livroEmp++;
    }
    
    public void decrementarLivroEmp(){
        if(livroEmp > 0){
            livroEmp--;
        }
    }
    
    public boolean podePegarLivro(){
        return true;
    }
  
    @Override
    public String toString(){
        return "\n Usuario{" + 
               "\n Nome: " + nome +
               "\n Id: " + id +
               "\n Livros Emprestados: " + livroEmp +
               "}";
    }
}
