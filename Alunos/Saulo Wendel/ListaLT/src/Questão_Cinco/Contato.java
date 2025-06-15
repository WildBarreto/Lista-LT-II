package Questão_Cinco;


public class Contato {
   String nome, email, telefone;
   
   public Contato(String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
   }
   
   @Override
   public String toString(){
   return "Nome :" + nome + " Email: " + email + " Telefone: " + telefone;
   }
   
   @Override
   public boolean equals(Object obj){
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Contato outro = (Contato) obj;
      return email != null && email.equals(outro.email);
   }
   @Override
   public int hashCode(){
       return email != null ? email.hashCode() : 0;
   }
 }
   

