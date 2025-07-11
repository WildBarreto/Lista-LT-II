package questão05;
import java.util.Objects;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(){
        
    }
    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return "\nNOME: " + getNome() + "\nEMAIL: " + getEmail() 
                + "\nTELEFONE: " + getTelefone();
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
        return Objects.equals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}