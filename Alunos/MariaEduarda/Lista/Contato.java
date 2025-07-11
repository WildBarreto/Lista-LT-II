package Lista;

import java.util.HashSet;

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
    public String toString() {
        return "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone;
    }
    
    @Override
    public boolean equals(Object obj) {
        Contato outro = (Contato) obj;
        return this.email.equalsIgnoreCase(outro.email);
}

    
    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }
    
    public static void main(String[] args) {
        
        Contato c1 = new Contato("ALice", "alicezinha@gmail.com", "9982-3489");
        Contato c2 = new Contato("Roberto", "betinho@gmail.com", "9999-2222");
        Contato c3 = new Contato("Alice 2", "alicezinha@gmail.com", "8888-0000"); // mesmo email do c1
        
        HashSet<Contato> contatos = new HashSet<>();
        
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        
        System.out.println("Contatos:");
        for (Contato c : contatos) {
            System.out.println(c); 
        }
    }
}

