package AnaHeloisia4info.questao6;

public class Endereco {
    
    String rua;
    int numero;
    String cidade;
    double cep;

    public Endereco(String rua, int numero, String cidade, double cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }
    
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
    