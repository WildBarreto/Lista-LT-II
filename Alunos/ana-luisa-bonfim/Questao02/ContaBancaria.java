/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author analu
 */
public class ContaBancaria {
    int numero;
    String titular;
    double saldo;
    
    public ContaBancaria(int numero, String titular, double saldo){
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
    }
    
    public void Depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void Sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }
        
        else{System.out.println("Saldo insuficiente");}
        
    }
    
    public void MostrarDados(){
        System.out.println("Titular: "+titular);
        System.out.println("Numero da conta: "+numero);
        System.out.println("Saldo disponivel: "+saldo + " R$");
    }
    
    
}
