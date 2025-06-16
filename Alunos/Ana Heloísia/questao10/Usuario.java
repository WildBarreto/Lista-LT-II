package AnaHeloisia4info.questao10;

import java.util.ArrayList;

public class Usuario {
      
    protected String nome;
    protected String id;
    protected ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean podeEmprestar() {
        return true; 
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
    
