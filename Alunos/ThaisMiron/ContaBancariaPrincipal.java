package l.t.pkg2;

import java.util.Scanner;


    public class ContaBancariaPrincipal {
    
    public static void main(String[] args) {
        
        ContaBancaria ContaBancariaPrincipal;
        int numero;
        String titular;
        double saldo;
        double valor;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n****CONTA BANCARIA****\n");
        
        
        System.out.println("Digite o nome do titular: ");
        titular = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite o saldo atual da conta: ");
        saldo = sc.nextDouble();
        
        ContaBancariaPrincipal = new ContaBancaria(numero, titular, saldo);
        ContaBancariaPrincipal.mostrarDados();
        
        System.out.println("_____________________________\n");
        System.out.println("Digite o valor que deseja depositar: ");
        valor = sc.nextDouble();
        ContaBancariaPrincipal.depositar(valor);
        
        System.out.println("Saldo atualizado: " + ContaBancariaPrincipal.getSaldo());
        
        System.out.println("\n_____________________________\n");
        System.out.println("Qual valor deseja sacar? ");
        valor = sc.nextDouble();
        
        ContaBancariaPrincipal.sacar(valor);
        System.out.println("Saldo atualizado: " + ContaBancariaPrincipal.getSaldo());
    }
}