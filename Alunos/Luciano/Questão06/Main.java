package Questão06;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            System.out.print("Digite a rua: ");
            String rua = sc.nextLine();

            System.out.print("Digite o número da casa: ");
            int numero = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            System.out.print("Digite a cidade: ");
            String cidade = sc.nextLine();

            System.out.print("Digite o CEP (8 dígitos): ");
            String cep = sc.nextLine();

            Endereço endereco = new Endereço(rua, numero, cidade, cep);
            Pessoa pessoa = new Pessoa(nome, idade, endereco);

            System.out.println("\nDados da Pessoa");
            System.out.println(pessoa.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
