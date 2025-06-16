package l.t.pkg2;

import java.util.Scanner;

public class EndereçoPrincipal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite a rua que reside: ");
        String rua = sc.nextLine();

        System.out.print("Digite o número da casa: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = sc.nextLine();

  
       Endereco e = new Endereco(rua, numero, cidade, cep);
       Pessoa p = new Pessoa(nome, idade, e);

        System.out.println("\n__________Dados da Pessoa__________");
        System.out.println(p);
        
        sc.close();
    }
}

