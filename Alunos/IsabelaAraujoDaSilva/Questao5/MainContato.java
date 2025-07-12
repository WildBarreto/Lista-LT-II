package Questao5;

import java.util.HashSet;

public class MainContato {
    public static void main(String[] args) {
       
        Contato contato1 = new Contato("Mariana", "mari@email.com", "9999-1234");
        Contato contato2 = new Contato("Lucas", "lucas@email.com", "8888-5678");
        Contato contato3 = new Contato("Fernanda", "mari@email.com", "7777-0000"); 
        Contato contato5 = new Contato("Tiago", "MARI@EMAIL.COM", "5555-8765");    
     
        System.out.println(contato1);
        System.out.println(contato3);
        System.out.println(contato5);
        System.out.println();

        System.out.println("contato1.equals(contato2): " + contato1.equals(contato2)); 
        System.out.println("contato1.equals(contato3): " + contato1.equals(contato3)); 
        System.out.println("contato1.equals(contato5): " + contato1.equals(contato5)); 
        System.out.println("contato3.equals(contato5): " + contato3.equals(contato5)); 
        System.out.println();
    
        HashSet<Contato> agenda = new HashSet<>();

        System.out.println("Adicionando contato1: " + agenda.add(contato1)); 
        System.out.println("Adicionando contato2: " + agenda.add(contato2)); 
        System.out.println("Adicionando contato3 (duplicado): " + agenda.add(contato3));
        System.out.println("Adicionando contato4: " + agenda.add(contato5)); 
        System.out.println("Adicionando contato5 (duplicado): " + agenda.add(contato5)); 

        System.out.println();
        System.out.println("Quantidade total de contatos na agenda: " + agenda.size()); 
        System.out.println("Contatos armazenados na agenda: " + agenda);
    }
}
