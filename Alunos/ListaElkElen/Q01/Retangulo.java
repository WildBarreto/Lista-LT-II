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
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(double largura, double altura){
        double area = largura * altura;
        return area;
    }
    
    public double calcularPerimetro(double largura, double altura){
        double perimetro = 2 * largura + 2 * altura;
        return perimetro; 
    }
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
        System.out.println("Calculando area e perimetro do retangulo I");
        System.out.println("Insira a largura: ");
        double largura1 = ler.nextDouble();
        System.out.println("Insira a altura: ");
        double altura1 = ler.nextDouble();
        
        Retangulo retangulo1 = new Retangulo(largura1, altura1);
        
        System.out.println("Area: "+ retangulo1.calcularArea(largura1, altura1));
        System.out.println("Perimetro: "+ retangulo1.calcularPerimetro(largura1, altura1));
        
        System.out.println("\nCalculando area e perimetro do retangulo II");
        System.out.println("Insira a largura: ");
        double largura2 = ler.nextDouble();
        System.out.println("Insira a altura: ");
        double altura2 = ler.nextDouble();
        
        Retangulo retangulo2 = new Retangulo(largura2, altura2);
        
        System.out.println("Area: "+ retangulo2.calcularArea(largura2, altura2));
        System.out.println("Perimetro: "+ retangulo2.calcularPerimetro(largura2, altura2));
        
    }
}
