package Questao2;

import java.util.Scanner;

public class MainContaBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        ContaBancaria conta = new ContaBancaria(12345, "Joao Almeida", 1000);
        
        
        System.out.println("Dados inicias da conta:");
        conta.mostrarDados();
        
        System.out.println("Digite o valor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        
        conta.mostrarDados();
        
        
        System.out.println("Digite o valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        
        conta.mostrarDados();
        
        scanner.close();
    }
}
