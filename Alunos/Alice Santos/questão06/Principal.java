package questão06;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nINFORME OS DADOS PESSOAIS E O ENDEREÇO:");
        System.out.print("\nNOME: ");
        String nome = sc.nextLine();

        System.out.print("IDADE: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("RUA: ");
        String rua = sc.nextLine();

        System.out.print("NÚMERO: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("CIDADE: ");
        String cidade = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        System.out.println("\n --- DADOS ADICIONADOS --- ");
        System.out.println(pessoa);

        sc.close();
    }
}
