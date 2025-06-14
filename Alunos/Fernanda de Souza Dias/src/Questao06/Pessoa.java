package Questao06;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;

    @Override
    public String toString() {
        return nome + ", " + idade + " anos, Endereço: " + endereco;
    }
}
