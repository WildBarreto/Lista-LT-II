package Questão5;

public class Contato {
    
private String nome;
private String email;
private String telefone;

public Contato(String nome, String email, String telefone) {
    
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}

   
    public String getNome() {
        return nome;
}

    public String getEmail() {
        return email;
}

    public String getTelefone() {
        return telefone;
 }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " - " + email + " - " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contato) {
            Contato outro = (Contato) obj;
            return this.email.equals(outro.getEmail());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
  
    }
}

