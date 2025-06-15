package Exercicio05;

/**
 *
 * @author Fernanda Santos
 */
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
        return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;
        Contato outro = (Contato) obj;
        return email.equalsIgnoreCase(outro.email); // considera e-mails iguais como duplicados
    }

    @Override
    public int hashCode() {
        return Objects.hash(email.toLowerCase());
    }
}
