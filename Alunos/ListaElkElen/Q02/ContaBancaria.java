/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

import java.util.Scanner;

/**
 *
 * @author elkin
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        
    }
    
    public void sacar(double valor){
        if (saldo > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println(valor + " sacado com sucesso.");
        }else{
            System.out.println("Saque não permitido.");
        }
    }
    
    public void mostrarDados(){
        System.out.println("Numero da conta: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta:");
        String numero = scanner.nextLine();
        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);

        System.out.println("\nDados iniciais da conta:");
        conta.mostrarDados();

        System.out.println("\nDigite o valor para depositar:");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("\nDados após depósito:");
        conta.mostrarDados();

        System.out.println("\nDigite o valor para sacar:");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("\nDados após saque:");
        conta.mostrarDados();
    
    }
    
}
