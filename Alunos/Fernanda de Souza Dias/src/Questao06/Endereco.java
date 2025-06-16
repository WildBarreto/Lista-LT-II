package Questao06;

public class Endereco {
    String rua, cidade, cep;
    int numero;

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + cidade + " - " + cep;
    }
}
