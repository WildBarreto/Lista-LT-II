/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao06;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal {
    public static void main(String[]args) {
    
    Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe o nome da pessoa: ");
        String nome = ler.nextLine();
        
        System.out.println("\nInforme a idade da pessoa: ");
        int idade = ler.nextInt();
        
        ler.nextLine();
        
        System.out.println("\nInforme a rua da pessoa: ");
        String rua = ler.nextLine();
        
        System.out.println("\nInforme o numero da casa: ");
        int numero = ler.nextInt();
        
        ler.nextLine();
        System.out.println("\nInforme a cidade: ");
        String cidade = ler.nextLine();
        
        System.out.println("\nInforme o cep: ");
        String cep = ler.nextLine();
        
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        
        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        
        System.out.println("--- INFORMACOES DA PESSOA ---" +pessoa);
        
    
    
    }
}