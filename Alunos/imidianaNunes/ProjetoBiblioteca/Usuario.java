package ProjetoBiblioteca;
import java.util.ArrayList;
/**
 *
 * @author imidi
 */
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

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}

