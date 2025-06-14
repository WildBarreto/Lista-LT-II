package Questão6;


public class Pessoa {
    
    String nome;
    int idade;
    Endereco endereco;
    
    public Pessoa (String nome, int idade, Endereco endereco){
    
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
    
    }
    
     public String toString() {
        return "Nome: " + nome + "\n, Idade: " + idade + "\nEndereço: " + endereco;
    }
    
    
}
