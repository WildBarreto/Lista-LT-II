/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao01;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Retangulo {
  //Crie uma classe Retangulo com atributos largura e altura.
    
    private double largura;
    private double altura; 

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularArea(){
      
      
    return largura*altura;
    }
    
    public double calcularPerimetro(){
      
    return 2*(largura + altura);
    }
    
   
    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        
  
        
        System.out.println("Informe a largura do primeiro retangulo:");
        double largura1 = ler.nextDouble();
        System.out.println("Informe a altura do primeiro retangulo:");
        double altura1 = ler.nextDouble();
        
        Retangulo ret1 = new Retangulo(largura1,altura1);
        
        
        
        System.out.println("\nInforme a largura do segundo retangulo:");
        double largura2 = ler.nextDouble();
        System.out.println("Informe a altura do segundo retangulo:");
        double altura2 = ler.nextDouble();
        
        Retangulo ret2 = new Retangulo(largura2,altura2);
        
        System.out.println("\nA area do retangulo 1 e igual a: " +ret1.calcularArea());
        System.out.println("O perimetro do retangulo 1 e igual a: " +ret1.calcularPerimetro());
        
        System.out.println("\nA area do retangulo 2 e igual a: " +ret2.calcularArea());
        System.out.println("O perimetro do retangulo 2 e igual a: " +ret2.calcularPerimetro());
        
        
    }
      
      
    
    
    
    
    
    
    
    
    
    
    
    
}