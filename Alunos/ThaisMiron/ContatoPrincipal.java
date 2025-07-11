package l.t.pkg2;

import java.util.HashSet;
import java.util.Scanner;

public class ContatoPrincipal {
    public static void main(String[] args) {
    HashSet<Contato> contatos = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("________Contatos_________");
        
        System.out.println("Deseja adicionar quantos contatos?:");
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<x; i++){
            Contato cont;
            System.out.println("Digite o nome da pessoa:");
            String nome = sc.nextLine();
            System.out.println("Digite o email:");
            String email = sc.nextLine();
            System.out.println("Digite o telefone:");
            String telefone = sc.nextLine();
            cont = new Contato(nome, email, telefone);
            contatos.add(cont);
        }

        System.out.println("Contatos no HashSet:");
        for (Contato cont : contatos) {
            System.out.println(cont);
        
        System.out.println("*****Contato salvo com sucesso!!*****");
        }
    }
}
    
