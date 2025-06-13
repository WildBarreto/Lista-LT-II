/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao04;

/**
 *
 * @author analu
 */
public class Calculadora {
    
    public int somar(int a, int b){
    return a + b;
    }
    
    public double somar(double a, double b){
    return a + b;
    }
    
    public int somar(int[] valores){
        int total = 0;
        for (int valor:valores){
        total += valor;
        }
    return total;
    }
    
    public static void main(String[] args) {
    
    Calculadora calculadora = new Calculadora();
    
    System.out.println("Primeiro tipo, utilizando INT: " +calculadora.somar(5,10));
    
    System.out.println("\nSegundo tipo, utilizando DOUBLE: " +calculadora.somar(12.50, 20.8));
    
    int[] valores = {1, 2, 3, 4, 5};
    System.out.println("\nTerceiro tipo, utilizando ARRAY: " +calculadora.somar(valores));
    
    }
    
}
