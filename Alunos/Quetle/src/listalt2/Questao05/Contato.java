package listalt2.Questao05;

import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

public class Contato {
    String nome;
    String email;
    String telefone; 

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    @Override
    public String toString(){
     return "\n Nome: " + nome + "\n Email: " + email + "\n Telefone: " + telefone;
}
   @Override
   public boolean equals(Object o){
    if( this == o ) return true;
    if(o ==null || getClass() != o.getClass()) return false;
    Contato contato = (Contato) o;
    return Objects.equals(email, contato.email);
   }
   @Override
   public int hashCode(){
   return Objects.hash(email);
   }
   
   public static void main(String[]args){
   Set<Contato> contatos = new HashSet<>();
   
   Contato c1 = new Contato("Maria Antônia", "AntoniaMaria@gmail.com", "74999251144");
   Contato c2 = new Contato("Wallace", "WallacedaRodagem@gmail.com", "749999567021");
   Contato c3 = new Contato("Luan", "Luanm@gamil.com", "201945608432");
   
   System.out.println("Incerindo c1: " + contatos.add(c1));
   System.out.println("Incerindo c2: " + contatos.add(c2));
   System.out.println("Incerindo c3: " + contatos.add(c3));
   
   System.out.println("\nContatos:");
   contatos.forEach(System.out::println);
   }
}

