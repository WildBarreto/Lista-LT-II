package Questao01;

import java.util.Scanner;

public class TestaRetanguloMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        System.out.print("Digite largura e altura do primeiro retângulo: ");
        r1.largura = sc.nextDouble();
        r1.altura = sc.nextDouble();

        System.out.print("Digite largura e altura do segundo retângulo: ");
        r2.largura = sc.nextDouble();
        r2.altura = sc.nextDouble();

        System.out.println("Área R1: " + r1.calcularArea() + ", Perímetro R1: " + r1.calcularPerimetro());
        System.out.println("Área R2: " + r2.calcularArea() + ", Perímetro R2: " + r2.calcularPerimetro());
    }
    
}
