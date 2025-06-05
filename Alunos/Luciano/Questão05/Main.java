package Questão05;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Luciano", "lucianofutsal02@gmail.com", "(74)998088834");
        Contato c2 = new Contato("Nagila", "Jiitae@gmail.com", "2222-2222");
        Contato c3 = new Contato("Luciano Jr", "lucianofutsal02@gmail.com", "3333-3333"); 

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); 

        System.out.println("Contatos no conjunto:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
