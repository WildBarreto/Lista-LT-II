package Questão06;

public class Endereço {
    private String rua;
    private int numero;
    private String cidade;
    private String cep;

    public Endereço(String rua, int numero, String cidade, String cep) {
        if (!cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP deve conter exatamente 8 dígitos numéricos.");
        }
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "\nRua: " + rua + "; \nNúmero: " + numero + "; \nCidade: " + cidade + "; \nCEP: " + cep;
    }
}
