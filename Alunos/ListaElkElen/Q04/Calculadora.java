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
public class Calculadora {
    
    public int somar(int a, int b){
        return a + b;
    }
    
    public double somar(double a, double b){
        return a + b;
    }
    
    public int somar(int[] valores){
        int soma = 0;
        for(int valor : valores){
            soma += valor; 
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Insira um valor inteiro: ");
        int a1 = ler.nextInt();
        System.out.println("Insira outro valor inteiro: ");
        int b1 = ler.nextInt();
        
        int resultadoint = calculadora.somar(a1, b1);
        System.out.println("\nSoma de inteiros: " + resultadoint);
        
        System.out.println("\nInsira um valor do tipo double: ");
        double a2 = ler.nextDouble();
        System.out.println("Insira outro valor do tipo double: ");
        double b2 = ler.nextDouble();
        
        double resultadodouble = calculadora.somar(a2, b2);
        System.out.println("\nSoma de doubles: " + resultadodouble);
        
        System.out.println("\nQuantos valores deseja somar em vetor?");
        int tamanho = ler.nextInt();
        
        int[] valores = new int[tamanho];
        
        for(int i = 0; i < valores.length; i++){
            System.out.println("Insira o número "+(i+1)+":");
            valores[i] = ler.nextInt();
        }
        
        int resultado3 = calculadora.somar(valores);
        System.out.println("\nSoma de vetor: "+resultado3);
        
    }
}
