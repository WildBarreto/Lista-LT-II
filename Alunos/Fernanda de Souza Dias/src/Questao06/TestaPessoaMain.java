package Questao06;

public class TestaPessoaMain {

    public static void main(String[] args) {
        Endereco e = new Endereco();
        e.rua = "Av. Brasil";
        e.numero = 100;
        e.cidade = "Central";
        e.cep = "44940-000";

        Pessoa p = new Pessoa();
        p.nome = "Fernanda";
        p.idade = 18;
        p.endereco = e;

        System.out.println(p);
    }
    
}
