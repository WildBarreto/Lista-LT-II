/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author analu
 */
public class Operacoes {
    public static void main(String[] args){
    
    ContaBancaria pessoa1 = new ContaBancaria(1234, "Joaozinho", 1200);
    
    pessoa1.MostrarDados();
    
    pessoa1.Depositar(100);
    System.out.println("\nConta depois do deposito");
    pessoa1.MostrarDados();
    
    pessoa1.Sacar(1200);
    System.out.println("\nConta depois do saque");
    pessoa1.MostrarDados();
    
    System.out.println("\nPessoa tenta realizar outro saque");
    pessoa1.Sacar(200);
    pessoa1.MostrarDados();
    
    }
}
