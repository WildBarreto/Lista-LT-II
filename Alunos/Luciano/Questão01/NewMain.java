
package Questão01;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a largura do primeiro retangulo:");
        double largura1 = entrada.nextDouble();
        System.out.println("Digite a altura do primeiro retangulo:");
        double altura1 = entrada.nextDouble();

        Retangulo retangulo1 = new Retangulo(largura1, altura1);

        System.out.println("Digite a largura do segundo retangulo:");
        double largura2 = entrada.nextDouble();
        System.out.println("Digite a altura do segundo retangulo:");
        double altura2 = entrada.nextDouble();

        Retangulo retangulo2 = new Retangulo(largura2, altura2);

        System.out.println("\n--- Resultados ---");

        System.out.println("Retangulo 1:");
        System.out.println("Area: " + retangulo1.calcularArea());
        System.out.println("Perimetro: " + retangulo1.calcularPerimetro());

        System.out.println("\nRetangulo 2:");
        System.out.println("Area: " + retangulo2.calcularArea());
        System.out.println("Perimetro: " + retangulo2.calcularPerimetro());

        entrada.close();
    }
}
