/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6;

/**
 *
 * @author jjhon
 */
import java.util.Scanner;
public class MainEndereco {

        private String nome;
        private int idade;
        private Endereco endereco;

        public MainEndereco(String nome, int idade, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade + " anos\nEndereço: " + endereco.toString();
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Pessoa e Endereço ---");

        System.out.print("Informe a rua: ");
        String rua = scanner.nextLine();

        System.out.print("Informe o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Informe o CEP: ");
        String cep = scanner.nextLine();

        Endereco enderecoPessoa = new Endereco(rua, numero, cidade, cep);

        System.out.print("\nInforme o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        MainEndereco pessoa = new MainEndereco(nome, idade, enderecoPessoa);

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println(pessoa.toString());

        scanner.close();
    }
}


