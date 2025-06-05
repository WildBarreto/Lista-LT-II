package Questão06;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereço endereco;

    public Pessoa(String nome, int idade, Endereço endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco.toString();
    }
}
