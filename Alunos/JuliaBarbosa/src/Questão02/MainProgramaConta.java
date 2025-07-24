package Questão02;

import java.util.Scanner;

public class MainProgramaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Abertura de Conta ==");
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);

        System.out.println("\n--- Dados da Conta ---");
        conta.mostrarDados();

        System.out.print("\nDigite o valor para depositar: R$");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor para sacar: R$");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println("\n--- Dados Finais da Conta ---");
        conta.mostrarDados();

        scanner.close();
    }
}

    
    