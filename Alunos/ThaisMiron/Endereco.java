
package l.t.pkg2;

class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private int cep;
    

    public Endereco(String rua, String numero, String cidade, int cep){
        this(rua, cep, numero, cidade);
    }

    public Endereco(String rua, int cep, String numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + ", Nº: " + numero + ", Cidade: " + cidade + ", CEP: " + cep;
    }
    
}
