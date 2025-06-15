package Exercicio05;

/**
 *
 * @author Fernanda Santos
 */
import java.util.HashSet;

public class MainContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com", "9999-0001");
        Contato c2 = new Contato("Bruno", "bruno@email.com", "9999-0002");
        Contato c3 = new Contato("Ana Paula", "ana@email.com", "9999-0003"); // e-mail duplicado

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); // não será adicionado

        System.out.println("Lista de Contatos (sem duplicados de e-mail):\n");

        for (Contato c : contatos) {
            System.out.println(c);
            System.out.println("------------");
        }
    }
}


  
