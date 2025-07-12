package ListaLT2;

import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro retângulo
        System.out.println("Informe a largura do primeiro retangulo:");
        double largura1 = scanner.nextDouble();
        System.out.println("Informe a altura do primeiro retangulo:");
        double altura1 = scanner.nextDouble();

        Retangulo ret1 = new Retangulo(largura1, altura1);

        // Segundo retângulo
        System.out.println("Informe a largura do segundo retangulo:");
        double largura2 = scanner.nextDouble();
        System.out.println("Informe a altura do segundo retangulo:");
        double altura2 = scanner.nextDouble();

        Retangulo ret2 = new Retangulo(largura2, altura2);

        System.out.println("\nResultado para o primeiro retângulo:");
        System.out.println("Area: " + ret1.calcularArea());
        System.out.println("Perímetro: " + ret1.calcularPerimetro());

        System.out.println("\nResultado para o segundo retângulo:");
        System.out.println("Area: " + ret2.calcularArea());
        System.out.println("Perimetro: " + ret2.calcularPerimetro());

        // scanner.close(); // Opcional, não fecha se você estiver usando o Scanner para mais coisas depois
    }
}

class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}