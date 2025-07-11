package Questao05;

import java.util.Objects;

public class Contato {
    String nome;
    String email;
    String telefone;

    @Override
    public String toString() {
        return nome + " - " + email + " - " + telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato c = (Contato) o;
        return email.equals(c.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
