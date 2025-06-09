package questao01;

import java.util.Scanner;

public class AppRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo 1: ");
        double l1 = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo 1: ");
        double a1 = scanner.nextDouble();

        Retangulo r1 = new Retangulo(l1, a1);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());

        System.out.println("Digite a largura do retangulo 2: ");
        double l2 = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo 2: ");
        double a2 = scanner.nextDouble();

        Retangulo r2 = new Retangulo(l2, a2);

        System.out.println("Area: " + r2.area());
        System.out.println("Perimetro: " + r2.perimetro());

        scanner.close();
    }
}
