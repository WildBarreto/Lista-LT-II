/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

import java.util.Objects;

/**
 *
 * @author curso
 */
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
        return "--Contato--" + "\nnome = " + nome + "\nemail = " + email + "\ntelefone = " + telefone + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.email);
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
        return Objects.equals(this.email, other.email);
    }

     
     
}
