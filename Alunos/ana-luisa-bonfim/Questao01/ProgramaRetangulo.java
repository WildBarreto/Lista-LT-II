/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

import java.util.Scanner;

/**
 *
 * @author analu
 */
public class ProgramaRetangulo {
    public static void main(String[] args){
    
    Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a largura do retangulo 1: ");
        double largura1 = ler.nextDouble();
        System.out.println("Digite a altura do retangulo 1: ");
        double altura1 = ler.nextDouble();
        Retangulo retangulo1 = new Retangulo(largura1, altura1);
        
        System.out.println("Digite a largura do retangulo 2: ");
        double largura2 = ler.nextDouble();
        System.out.println("Digite a altura do retangulo 2: ");
        double altura2 = ler.nextDouble();
        Retangulo retangulo2 = new Retangulo(largura2, altura2);
        
        
        System.out.println("Area do retangulo 1: "+retangulo1.AreaRetangulo());
        System.out.println("Perimetro do retangulo 1: "+retangulo1.PerimetroRetangulo());
        
        System.out.println("\nArea do retangulo 2: "+retangulo2.AreaRetangulo());
        System.out.println("Perimetro do retangulo 2: "+retangulo2.PerimetroRetangulo());
        
    }
}
