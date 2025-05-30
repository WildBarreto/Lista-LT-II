package Questao2;

import java.util.Scanner;

public class MainContaBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Criando a conta
        ContaBancaria conta = new ContaBancaria(12345, "Joao Almeida", 1000);
        
        //Mostrando dados iniciais
        System.out.println("Dados inicias da conta:");
        conta.mostrarDados();
        
        //Operação de depósito
        System.out.println("Digite o valor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        
        //Mostrando dados após o depósito
        conta.mostrarDados();
        
        //Operação de saque
        System.out.println("Digite o valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        
        //Mostrando dados após saque
        conta.mostrarDados();
        
        scanner.close();
    }
}
