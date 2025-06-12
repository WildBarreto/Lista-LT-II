package questao10;

import java.util.ArrayList;

public abstract class Usuario {
    private static int idUsuarioClass = 1;

    protected int id;
    protected String nome;

    protected ArrayList<Livro> livrosEmprestados;


    public Usuario(String nome) {
        this.id = idUsuarioClass;
        this.nome = nome;

        idUsuarioClass++;
    }

    public Usuario() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

}
