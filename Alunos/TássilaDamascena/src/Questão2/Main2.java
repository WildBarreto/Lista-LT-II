
package Questão2;

import java.util.Scanner;

public class Main2 {
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nomeTitular = input.nextLine();
        System.out.println("Digite o numero da conta: ");
        String numero = input.nextLine();
        System.out.println("Digite o valor do saldo inicial: ");
        double saldo = input.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(numero, nomeTitular, saldo);
        
        System.out.println("\nSeus dados: ");
        conta.mostrarDados();
        
        System.out.println("\n\nDigite o valor para depositar: ");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);
        
        System.out.println("\nSaldo apos deposito: " + conta.getSaldo());
    
        System.out.println("\nDigite o valor para sacar: ");
        double valorSacar = input.nextDouble();
        conta.sacar(valorSacar);
        
        System.out.println("\nSaldo apos saque: " + conta.getSaldo());
        
        
    }
    
    
    
    
    
}
