package Exercicio06;

import java.util.Scanner;

/**
 *
 * @author Fernanda Santos
 */
public class MainPessoaEndereco {
    
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Digite o nome da pessoa: ");
             String nome = sc.nextLine();
             
             System.out.print("Digite a idade: ");
             int idade = sc.nextInt();
             sc.nextLine(); 
             
             System.out.print("Digite a rua: ");
             String rua = sc.nextLine();
             
             System.out.print("Digite o numero: ");
             int numero = sc.nextInt();
             sc.nextLine(); 
             
             System.out.print("Digite a cidade: ");
             String cidade = sc.nextLine();
             
             System.out.print("Digite o CEP: ");
             String cep = sc.nextLine();
             
             Endereco endereco = new Endereco(rua, numero, cidade, cep);
             Pessoa pessoa = new Pessoa(nome, idade, endereco);
             
             System.out.println("\n  DADOS INFORMADOS:   \n");
             System.out.println(pessoa);
         }
    }
    
}
