package Questao10;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    // Nome do usuário
    protected String nome;
    // Identificador único do usuário
    protected String id;
    // Lista dos livros atualmente emprestados para este usuário
    protected List<Livro> livrosEmprestados = new ArrayList<>();

    // Construtor para inicializar nome e id
    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    // Retorna o id do usuário
    public String getId() {
        return id;
    }

    // Método abstrato que determina se o usuário pode emprestar mais livros
    public abstract boolean podeEmprestar();

    // Adiciona um livro à lista de empréstimos do usuário
    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    // Remove um livro da lista de empréstimos do usuário
    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    // Retorna a lista de livros emprestados
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Representação textual do usuário
    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}
