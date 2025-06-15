package listalt2.Questao02;

import java.util.Scanner;

public class ContaBancaria02 {
   private int numero;
   private String titular; 
   private double saldo;

    public ContaBancaria02(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor){
        if(valor > 0){ 
            saldo += valor;
            System.out.println("Depósito de: "+valor+ " realizado com sucesso!");
        } else{
            System.out.println("Esse valor não é possível de fazer depósito, tente novamente, por favor!");
        }
    }
    
    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$ " +valor+ " realizado com sucesso.");
    } else{
            System.out.println("Saldo insuficiente, por favor verifique o seu saldo e tente novamente");
        }
    }
    public void mostrarDados(){
        System.out.println("\n----Dados da Conta----");
        System.out.println("Número: " + numero);
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: R$" + saldo);   
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n---Digites os dados da conta---");
        System.out.println("Número da conta. (Apenas números, por favor!)");
        int numero = Integer.parseInt(ler.nextLine());
        
        System.out.println("Nome do titular: ");
        String titular = ler.nextLine();
        
        System.out.println("Saldo inicial: R$ ");
        double saldo = Double.parseDouble(ler.nextLine());
        
        ContaBancaria02 conta = new ContaBancaria02(numero, titular, saldo);  
        conta.mostrarDados();
     
        int opcao;
        
        do{
            System.out.println("\n- Escolha uma das Opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver dados da conta");
            System.out.println("0. Sair");
            opcao = Integer.parseInt(ler.nextLine()); 
     
      switch (opcao) {
            case 1 -> {
                System.out.println("\n Valor para depósito: ");
                double deposito = Double.parseDouble(ler.nextLine());
                conta.depositar(deposito);
                conta.mostrarDados();
                }
            case 2 -> {
                System.out.println("\n Valor para saque: ");
                double saque = Double.parseDouble(ler.nextLine());
                conta.sacar(saque);
                conta.mostrarDados();
                }
            case 3 -> conta.mostrarDados();
            case 0 -> System.out.println("Sair");
      } 
    }while(opcao != 0);     
    ler.close();
   }
}
