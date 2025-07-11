package l.t.pkg2;

import java.util.Scanner;

    public class ProgramaRetangulo {
    public static void main(String[] args) {
        // Retângulo 1
        try (Scanner scanner = new Scanner(System.in)) {
            // Retângulo 1
            System.out.println("Digite a largura retângulo 1:");
            double largura1 = scanner.nextDouble();
            System.out.println("Digite a altura do retângulo 1:");
            double altura1 = scanner.nextDouble();
            
            Retangulo ret1 = new Retangulo(largura1, altura1);
            
            // Retângulo 2
            System.out.println("Digite a largura do Retângulo 2:");
            double largura2 = scanner.nextDouble();
            System.out.println("Digite a altura do Retângulo 2:");
            double altura2 = scanner.nextDouble();
            
            Retangulo ret2 = new Retangulo(largura2, altura2);
            
            // Resultados
            System.out.println("\n--- Resultados do Retângulo 1 ---");
            System.out.println("Área: " + ret1.calcularArea());
            System.out.println("Perímetro: " + ret1.calcularPerimetro());
            
            System.out.println("\n--- Resultados do Retângulo 2 ---");
            System.out.println("Área: " + ret2.calcularArea());
            System.out.println("Perímetro: " + ret2.calcularPerimetro());
        }
    }
     }
