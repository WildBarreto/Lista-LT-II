package Questão_Seis;



public class Endereco {
   
    String rua, cidade;
    int numero, cep;
    
    public Endereco(String rua, int numero, String cidade, int cep){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep; 
    }
   @Override
   public String toString(){
       return "Rua: " + rua + " Cidadade: " + cidade +  " Numero: " + numero + " Cep: " + cep;
   }
}
