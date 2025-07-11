package AnaHeloisia4info.questao6;

import AnaHeloisia4info.questao6.Endereco;

public class Pessoa {
    
    String nome;
    int idade;
    Endereco enderecoo;

    public Pessoa(String nome, int idade, Endereco enderecoo) {
        this.nome = nome;
        this.idade = idade;
        this.enderecoo = enderecoo;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + enderecoo +
                '}';
    }
}