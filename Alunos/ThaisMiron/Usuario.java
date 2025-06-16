package l.t.pkg2;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nome;
    private String id;
    protected List<Livro> livros = new ArrayList<>();

    public Usuario() {}

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public abstract boolean estaAptoparaEmprestimo();
    
    public void pegarEmprestado(Livro l){
         livros.add(l);
    }
    
    public void devolverLivro(Livro l){
        livros.remove(l);
    }
     
}