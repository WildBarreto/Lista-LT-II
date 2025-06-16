
package Questão5;

import java.util.HashSet;

public class Main5 {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato cont1 = new Contato("Talita", "talitinha@email.com", "74 999474849");
        Contato cont2 = new Contato("Magno", "marcio@email.com", "74 998212223");
        Contato cont3 = new Contato("Tassila", "tassila@email.com", "74 988333435");
        Contato cont4 = new Contato("Laura", "laurear@email.com", "74 988333435");
        Contato cont5 = new Contato("Valentine", "tassila@email.com", "74 988333435");
        Contato cont6 = new Contato("Mariane", "mari@email.com", "74 988333435");
        

        contatos.add(cont1);
        contatos.add(cont2);
        contatos.add(cont3);
        contatos.add(cont4);
        contatos.add(cont5);
        contatos.add(cont6);

        for (Contato c : contatos) {
            System.out.println(c);
            
         }
    }
}
