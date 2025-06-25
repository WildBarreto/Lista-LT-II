package questão05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set <Contato> contatos = new HashSet<>();
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println(" --- CONTATOS --- ");

        System.out.print("QUANTOS CONTATOS VOCÊ QUER ADICIONAR? ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < x; i++) {
            System.out.println("\nCONTATO " + (i + 1));

            System.out.print("DIGITE O NOME: ");
            String nome = sc.nextLine();

            System.out.print("DIGITE O EMAIL: ");
            String email = sc.nextLine();

            System.out.print("DIGITE O TELEFONE: ");
            String telefone = sc.nextLine();

            Contato c = new Contato(nome, email, telefone);
            boolean adicionado = contatos.add(c);

            if (!adicionado) {
                System.out.println("ESTE CONTATO COM O RESPECTIVO EMAIL JÁ EXISTE E PORTANTO NÃO SERÁ ADICIONADO");
            }
        }

        System.out.println("\nLISTA DE CONTATOS NO HASHSET:");
        for (Contato c : contatos) {
            System.out.println(" -------------------- ");
            System.out.println(c);
        }

        sc.close();
    }
}