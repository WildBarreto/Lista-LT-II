/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao06;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("infome o nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("\ninfome a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\ninfome a rua: ");
        String rua = scanner.nextLine();
        
        System.out.println("\ninfome o numero da residencia: ");
        int numero= scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nInforme sua cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.println("\ninfome o cep: ");
        String cep = scanner.nextLine();
        
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pes1 = new Pessoa(nome, idade, endereco);
        
        
        System.out.println("\nDados da pessoa: \n");
        System.out.println(pes1.toString());
        
        
        
}
}