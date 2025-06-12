package questao06;

public class Pessoa {
    private String nome;
    private int idade;

    private Endereco endereco;


    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("--------------------------------------\n");
        s.append("Nome: " + nome + "\n");
        s.append("Idade: " + idade + "\n");
        s.append("Cidade: " + endereco.getCidade() + "\n");
        s.append("CEP: " + endereco.getCep() + "\n");
        s.append("Rua: " + endereco.getRua() + "\n");
        s.append("Numero: " + endereco.getNumero() + "\n");
        s.append("--------------------------------------\n");

        return s.toString();
    }
    
}
