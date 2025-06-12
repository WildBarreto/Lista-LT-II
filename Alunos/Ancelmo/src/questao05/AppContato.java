package questao05;

import java.util.HashSet;

public class AppContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ancelmo Augusto", "ancelmo@gmail.com", "4002-8922");
        Contato c2 = new Contato("Maria Eduarda", "maria@gmail.com", "8219-2182");
        Contato c3 = new Contato("Maria Antonia", "maria@gmail.com", "9393-1001");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); // será ignorado vevido ao email igual ao do objeto anterior

        System.out.println(contatos.toString());
    }
}
