import java.util.HashSet;
import java.util.Objects;

public class Contato {
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
        if (obj == null || getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public static void main(String[] args) {
        HashSet<Contato> agenda = new HashSet<>();

        Contato c1 = new Contato("Joao", "joao@email.com", "1111-1111");
        Contato c2 = new Contato("Maria", "maria@email.com", "2222-2222");
        Contato c3 = new Contato("Joao Silva", "joao@email.com", "3333-3333");

        System.out.println("Adicionando contato 1: " + agenda.add(c1));
        System.out.println("Adicionando contato 2: " + agenda.add(c2));
        System.out.println("Adicionando contato 3 (mesmo email do 1): " + agenda.add(c3));

        System.out.println("\nContatos na agenda:");
        for (Contato c : agenda) {
            System.out.println(c);
        }
    }
}