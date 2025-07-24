package Questão01;

import java.util.Scanner;
import Questão01.Retangulo;

public class MainProgramaRetangulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Retângulo 1 ==");
        System.out.print("Digite a largura: ");
        double largura1 = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura1 = scanner.nextDouble();
        Retangulo r1 = new Retangulo(largura1, altura1);

        System.out.println("\n== Retângulo 2 ==");
        System.out.print("Digite a largura: ");
        double largura2 = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura2 = scanner.nextDouble();
        Retangulo r2 = new Retangulo(largura2, altura2);

        System.out.println("\n--- Resultados ---");
        System.out.println("Retângulo 1:");
        r1.exibirDados();
        System.out.println("\nRetângulo 2:");
        r2.exibirDados();

        scanner.close();
    }
}

