package Questao1;

import Questao1.Retangulo;
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        //Invoca o scanner
        try (Scanner scanner = new Scanner(System.in)) {
            //Primeiro Retângulo
            System.out.println("Retangulo 1:");
            System.out.println("Digite a largura: ");
            double largura1 = scanner.nextDouble();
            
            System.out.println("Digite a altura: ");
            double altura1 = scanner.nextDouble();
            
            Retangulo ret1 = new Retangulo(largura1, altura1);
            
            //Segundo Retângulo
            System.out.println("\nRetangulo 2:");
            System.out.println("Digite a largura: ");
            double largura2 = scanner.nextDouble();
            
            System.out.println("Digite a altura: ");
            double altura2 = scanner.nextDouble();
            
            Retangulo ret2 = new Retangulo(largura2, altura2);
            
            //Exibir resultados
            System.out.println("\n=== Resultados ===");
            System.out.println("Retangulo 1 - Area: " + ret1.calcularArea() + " | Perimetro: " + ret1.calcularPerimetro());
            System.out.println("Retangulo 2 - Area: " + ret2.calcularArea() + " | Perimetro: " + ret2.calcularPerimetro());
        }
    }
}
