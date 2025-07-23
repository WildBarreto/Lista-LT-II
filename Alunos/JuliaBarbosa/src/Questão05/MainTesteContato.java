package Questão05;

import java.util.HashSet;
import Questão05.Contato;
public class MainTesteContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Julia", "jullya@email.com", "1234-1234");
        Contato c2 = new Contato("Sara", "SaraR@email.com", "2345-2345");
        Contato c3 = new Contato("Joaquim", "InacioJ@email.com", "3456-3456"); 

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); 

        System.out.println("Lista de contatos:\n");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}
