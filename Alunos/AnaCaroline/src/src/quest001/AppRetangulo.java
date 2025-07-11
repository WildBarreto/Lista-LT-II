package quest001;

import java.util.Scanner;

public class AppRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do retangulo 1: ");
        double largura1 = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo 1: ");
        double altura1 = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(largura1, altura1);
        System.out.println("Area: " + retangulo1.calcularArea());
        System.out.println("Perimetro: " + retangulo1.calcularPerimetro());

        System.out.println("Digite a largura do retangulo 2: ");
        double largura2 = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo 2: ");
        double altura2 = scanner.nextDouble();
        Retangulo retangulo2 = new Retangulo(largura2, altura2);
        System.out.println("Area: " + retangulo2.calcularArea());
        System.out.println("Perimetro: " + retangulo2.calcularPerimetro());

        scanner.close();
    }
}