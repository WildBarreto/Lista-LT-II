/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

/**
 *
 * @author elkin
 */
import java.util.ArrayList;

public abstract class Usuario {
    protected String nome;
    protected int id;
    protected ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public abstract boolean podeEmprestar();

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(String isbn) {
        livrosEmprestados.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public boolean temLivro(String isbn) {
        return livrosEmprestados.stream().anyMatch(l -> l.getIsbn().equals(isbn));
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ") - Livros emprestados: " + livrosEmprestados.size();
    }
}

class UsuarioComum extends Usuario {
    public UsuarioComum(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}

class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true; // sem limite
    }
}

