package ListaLT2;
import java.util.HashSet;

public class Questao5 {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Icaro", "icaro@gmail.com", "9999-84260");
        Contato c2 = new Contato("Hellen", "hellen@gmail.com", "9992-82511");
        Contato c3 = new Contato("Rubens", "icaro@gmail.com", "9999-48389"); // mesmo email do c1

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); // não será adicionado

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}

class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;
        Contato outro = (Contato) obj;
        return this.email.equalsIgnoreCase(outro.email);
    }

    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }
}