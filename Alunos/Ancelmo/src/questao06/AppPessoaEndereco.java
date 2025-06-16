package questao06;

import java.util.Scanner;

public class AppPessoaEndereco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine(); 

        System.out.print("Cidade: ");
        String cidade = scan.nextLine();

        System.out.print("CEP: ");
        String cep = scan.nextLine();

        System.out.print("Rua: ");
        String rua = scan.nextLine();

        System.out.print("Número: ");
        String numero = scan.nextLine();

        Endereco endereco = new Endereco(cidade, cep, rua, numero);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        System.out.println("\n" + pessoa.toString());
        scan.close();
    }
}
