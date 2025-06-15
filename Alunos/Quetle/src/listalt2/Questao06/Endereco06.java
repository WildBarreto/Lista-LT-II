package listalt2.Questao06;

class Endereco{
private String rua;
private int numero;
private String cidade;
private String cep; 

    public Endereco(String rua, int numero, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        }   
    @Override
    public String toString(){
    return "Endereço: " + rua + ", " +numero+ " - " + cidade + " - CEP: " + cep;
    }
}

class Pessoa{
private String nome;
private int idade;
private Endereco endereco;

        public Pessoa(String nome, int idade, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }
    @Override
    public String toString(){ 
        return "Pessoa: "+nome+ ", "+ idade+ " anos\n"+ endereco.toString();        
}
    }
    public class Endereco06{
      public static void main(String[]args){
          
         Endereco endereco = new Endereco("Tiririca", 123, "Lapão", "012233456-097");
         
         Pessoa pessoa = new Pessoa ("Maria Antônia", 19, endereco);
    
         System.out.println("Dados:");
         System.out.println(pessoa.toString());

      }    
}
