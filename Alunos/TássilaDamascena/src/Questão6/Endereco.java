
package Questão6;


public class Endereco {
    
    String rua;
    int numero;
    String cidade;
    String cep;
    
    public Endereco (String rua, int numero, String cidade, String cep){
    
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    
    }
    
    public String toString() {
        return "Rua: " + rua + ", Nº: " + numero + ", Cidade: " + cidade + ", CEP: " + cep;
    }
    
    
}
