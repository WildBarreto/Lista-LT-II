package Questão06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coletar dados da pessoa
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        input.nextLine(); // consumir quebra de linha

        // Coletar dados do endereço
        System.out.print("Digite a rua: ");
        String rua = input.nextLine();

        System.out.print("Digite o número: ");
        int numero = input.nextInt();
        input.nextLine(); // consumir quebra de linha

        System.out.print("Digite a cidade: ");
        String cidade = input.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = input.nextLine();

        // Criar objetos
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        // Exibir tudo
        System.out.println("\n=== Dados da Pessoa ===");
        System.out.println(pessoa.toString());

        input.close();
    }
}

    
    

