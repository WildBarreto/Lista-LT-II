
package Questão1;

import java.util.Scanner;

public class Main1 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a largura do retangulo 1: ");
        double largura1 = input.nextDouble();
        System.out.println("Digite a altura do retangulo 1: ");
        double altura1 = input.nextDouble();
        Retangulo retan1 = new Retangulo(largura1, altura1);
    
        System.out.println("\nDigite a largura do retangulo 2: ");
        double largura2 = input.nextDouble();
        System.out.println("Digite a altura do triangulo 2: ");
        double altura2 = input.nextDouble();
        Retangulo retan2 = new Retangulo (largura2, altura2);
        
        
        System.out.println("Retangulo 1 - Area: " + retan1.calcularArea());
        System.out.println("Perimetro: " + retan1.calcularPerimetro());
        
        
        System.out.println("\nRetangulo 2 - Area: " + retan2.calcularArea());
        System.out.println("Perimetro: " + retan2.calcularPerimetro());
        
        
    }
    
    
}
