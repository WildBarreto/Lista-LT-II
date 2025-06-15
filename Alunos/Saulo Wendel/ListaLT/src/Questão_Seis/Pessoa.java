package Questão_Seis;


import Questão_Seis.Endereco;



public class Pessoa {
    String nome;
    int idade;
    Endereco enderecoPessoal;
    
    public Pessoa(String nome, int idade, Endereco enderecoPessoal){
        this.nome = nome;
        this.idade = idade;
        this.enderecoPessoal = enderecoPessoal;
    }
    @Override
    public String toString() {
        return " Nome: " + nome + " Idade: " + idade + " Endereço: " + enderecoPessoal;
    }
}
