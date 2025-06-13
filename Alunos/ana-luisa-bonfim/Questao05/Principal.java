/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author analu
 */
public class Principal {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        Contato cont1 = new Contato("Ana", "ana@email.com", "1234-5678");
        Contato cont2 = new Contato("Joao", "joazinho@email.com", "1254-7854");
        Contato cont3 = new Contato("Segunda Ana", "ana@email.com", "9999-9999");

        contatos.add(cont1);
        contatos.add(cont2);
        contatos.add(cont3);

        System.out.println("Contatos: ");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
}
