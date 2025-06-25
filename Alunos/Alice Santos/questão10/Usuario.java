package questão10;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected String id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome.toUpperCase();
        this.id = id.toUpperCase();
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public abstract int getLimiteLivros();

    public boolean emprestarLivro(Livro livro) {
        if (livrosEmprestados.size() < getLimiteLivros()) {
            livrosEmprestados.add(livro);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(Livro livro) {
        return livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "USUÁRIO: " + nome + " (ID: " + id + ") - LIVROS EMPRESTADOS: " + livrosEmprestados.size();
    }
}
