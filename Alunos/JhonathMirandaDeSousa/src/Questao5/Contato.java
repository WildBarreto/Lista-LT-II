package Questao5;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private String email;
    private String telefone;
    
    //Construtor
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.telefone, other.telefone);
    }
    
    //Sobreescrita de métodos
    @Override
    public String toString(){
        return "Nome: " + nome + "E-mail: " + email + "Telefone: " + telefone;
    }
    
}
