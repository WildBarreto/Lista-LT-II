package exercicio1;

import exercicio1.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        System.out.println("Digite a largura do primeiro retangulo:");
        r1.largura = scanner.nextDouble();
        System.out.println("Digite a altura do primeiro retangulo:");
        r1.altura = scanner.nextDouble();

        System.out.println("Digite a largura do segundo retangulo:");
        r2.largura = scanner.nextDouble();
        System.out.println("Digite a altura do segundo retangulo:");
        r2.altura = scanner.nextDouble();

        System.out.println("\nRetangulo 1:");
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());

        System.out.println("\nRetangulo 2:");
        System.out.println("Area: " + r2.calcularArea());
        System.out.println("Perimetro: " + r2.calcularPerimetro());
    }
    
}
