package Questão10;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected String id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public abstract boolean podeEmprestar();

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ") - Livros emprestados: " + livrosEmprestados.size();
    }
}
