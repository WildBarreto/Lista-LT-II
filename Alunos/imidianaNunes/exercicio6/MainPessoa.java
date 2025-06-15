package exercicio6;
import exercicio6.Endereco;
import exercicio6.Pessoa;
import java.util.Scanner;
/**
 *
 * @author imidi
 */
public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        System.out.println("\nDados informados:");
        System.out.println(pessoa);
        
        sc.close();
    }
    
}
