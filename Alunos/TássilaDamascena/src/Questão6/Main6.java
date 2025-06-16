package Questão6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args ){
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Digite sua rua: ");
        String rua = input.nextLine();
        System.out.println("Digite o numero da rua: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("Digite sua cidade: ");
        String cidade = input.nextLine();
        System.out.println("Digite seu cep: ");
        String cep = input.nextLine();
        
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        // Exibição usando toString
        System.out.println("\nDADOS CADASTRADOS:");
        System.out.println(pessoa);

        
    
    }
  
    
}
