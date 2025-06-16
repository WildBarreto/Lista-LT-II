package Lista.Questao10;

import java.util.ArrayList;

public class Usuario {
    
    String nome;
    int id;
    
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
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

    public String listarLivros() {
        
        String resultado = "Livros de " + nome + ":\n";
        for (Livro l : livrosEmprestados) {
            resultado += "  - " + l.titulo + "\n";
        }
        return resultado;
}

}
