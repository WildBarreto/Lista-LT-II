package exercicio2;

import exercicio2.ContaBancaria;
import java.util.Scanner;
/**
 *
 * @author imidi
 */
public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();
     
        System.out.print("Digite o numero da conta: ");
        conta.numero = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        conta.titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = scanner.nextDouble();

        System.out.println("\n--- Dados Iniciais ---");
        conta.mostrarDados();

        System.out.print("\nValor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("\n--- Dados Apos Operacoes ---");
        conta.mostrarDados();

        scanner.close();
    }
    
}
