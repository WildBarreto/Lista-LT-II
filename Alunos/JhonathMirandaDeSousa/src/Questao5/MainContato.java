
package Questao5;

/**
 *
 * @author jjhon
 */

import java.util.HashSet;

public class MainContato {
    public static void main(String[] args) {
        // Instanciação de contatos
        Contato contato1 = new Contato("Mariana", "mari@email.com", "9999-1234");
        Contato contato2 = new Contato("Lucas", "lucas@email.com", "8888-5678");
        Contato contato3 = new Contato("Fernanda", "mari@email.com", "7777-0000"); // Mesmo e-mail de contato1
        Contato contato4 = new Contato("Rafael", "rafael@email.com", "6666-4321");
        Contato contato5 = new Contato("Tiago", "MARI@EMAIL.COM", "5555-8765");    // Mesmo e-mail de contato1/contato3 (ignora maiúsculas)

        // Teste do método toString()
     
        System.out.println(contato1);
        System.out.println(contato3);
        System.out.println(contato5);
        System.out.println();

        // Teste do método equals()
        
        System.out.println("contato1.equals(contato2): " + contato1.equals(contato2)); // Esperado: false
        System.out.println("contato1.equals(contato3): " + contato1.equals(contato3)); // Esperado: true
        System.out.println("contato1.equals(contato5): " + contato1.equals(contato5)); // Esperado: true
        System.out.println("contato3.equals(contato5): " + contato3.equals(contato5)); // Esperado: true
        System.out.println();

        // Teste com HashSet para evitar duplicações
    
        HashSet<Contato> agenda = new HashSet<>();

        System.out.println("Adicionando contato1: " + agenda.add(contato1)); // true
        System.out.println("Adicionando contato2: " + agenda.add(contato2)); // true
        System.out.println("Adicionando contato3 (duplicado): " + agenda.add(contato3)); // false
        System.out.println("Adicionando contato4: " + agenda.add(contato4)); // true
        System.out.println("Adicionando contato5 (duplicado): " + agenda.add(contato5)); // false

        System.out.println();
        System.out.println("Quantidade total de contatos na agenda: " + agenda.size()); // Esperado: 3
        System.out.println("Contatos armazenados na agenda: " + agenda);
    }
}
