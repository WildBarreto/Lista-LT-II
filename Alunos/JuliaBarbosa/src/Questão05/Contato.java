package Questão05;

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
        return "Contato{" +
                "Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", Telefone='" + telefone + '\'' +
                '}';
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
}


