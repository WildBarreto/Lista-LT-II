/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author elkin
 */
public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;

        Contato outro = (Contato) obj;
        return email.equalsIgnoreCase(outro.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(email.toLowerCase()); 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Contato> contatos = new HashSet<>();

        System.out.print("Quantos contatos deseja adicionar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("\nContato " + i + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            Contato novoContato = new Contato(nome, email, telefone);

            if (contatos.add(novoContato)) {
                System.out.println("Contato adicionado com sucesso.");
            } else {
                System.out.println("Contato com este email já existe! Ignorado.");
            }
        }

        System.out.println("\nLista de contatos:");
        for (Contato c : contatos) {
            System.out.println(c);
        }

        
    }
}
