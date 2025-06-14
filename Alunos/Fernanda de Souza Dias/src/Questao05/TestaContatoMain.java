package Questao05;

import java.util.HashSet;

public class TestaContatoMain {

    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();
        Contato c1 = new Contato();
        c1.nome = "Fernanda";
        c1.email = "f@exemplo.com";
        c1.telefone = "99999";

        Contato c2 = new Contato();
        c2.nome = "Outra";
        c2.email = "f@exemplo.com";  
        c2.telefone = "88888";

        contatos.add(c1);
        contatos.add(c2);

        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    
}
