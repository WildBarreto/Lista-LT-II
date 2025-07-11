package Exercicio10;

/**
 *
 * @author Fernanda Santos
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    protected String nome;
    protected int id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean podeEmprestar() {
        // Por padrão, permite até 3 livros (sobrescrito na classe UsuarioPremium)
        return livrosEmprestados.size() < 3;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Livros emprestados: " + livrosEmprestados.size();
    }
}
