package questão02;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("DIGITE O NÚMERO DA CONTA: ");
        String numero = scanner.nextLine();
        
        System.out.print("DIGITE O NOME DO TITULAR: ");
        String titular = scanner.nextLine();

        System.out.print("DIGITE O SALDO INICIAL: ");
        double saldoInicial = scanner.nextDouble();

        
        ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);

        System.out.println("\n --- SALDO ANTERIOR --- ");
        conta.mostrarDados();

        System.out.print("\nDIGITE O VALOR PARA O DEPÓSITO: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("\nDIGITE O VALOR PARA O SAQUE: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println("\n --- SALDO ATUAL --- ");
        conta.mostrarDados();

        scanner.close();
    }
}