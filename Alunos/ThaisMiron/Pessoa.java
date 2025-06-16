
package l.t.pkg2;

public class Pessoa {

    private final String nome;
    private final int idade;
    private final Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
  }    
    

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco;
  }
}