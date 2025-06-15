package Exercicio02;

/**
 *
 * @author Fernanda Santos
 */
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Digite o numero da conta: ");
            String numero = input.nextLine();
            
            System.out.print("Digite o nome do titular: ");
            String titular = input.nextLine();
            
            System.out.print("Digite o saldo inicial: R$ ");
            double saldoInicial = input.nextDouble();
            
            ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);
            
            System.out.println("\n    DADOS INICIAIS     \n"); 
            conta.mostrarDados();
            
            System.out.println("\n     OPERACOES     \n");
            System.out.print("Valor para depositar: R$ ");
            double deposito = input.nextDouble();
            conta.depositar(deposito);
            
            System.out.print("Valor para sacar: R$ ");
            double saque = input.nextDouble();
            conta.sacar(saque);
            
            System.out.println("\n   DADOS APOS OPERACOES   \n");
            conta.mostrarDados();
        }
    }
}

