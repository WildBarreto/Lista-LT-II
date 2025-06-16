package Lista.Questao6;
import java.util.Scanner;

public class Pessoa {
    
    String nome;
    int idade;
    
    Endereco endereco = new Endereco(); 
    
    public void mostrarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        
        System.out.print("Digite o nome: ");
        p.nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        p.idade = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        
        System.out.print("Digite a rua: ");
        p.endereco.rua = sc.nextLine();
        System.out.print("Digite o numero da casa: ");
        p.endereco.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a cidade: ");
        p.endereco.cidade = sc.nextLine();
        System.out.print("Digite o CEP: ");
        p.endereco.cep = sc.nextLine();
        
        p.mostrarDados();
    }
}

