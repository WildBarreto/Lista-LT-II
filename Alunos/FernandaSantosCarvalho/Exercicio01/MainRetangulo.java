package Exercicio01;

/**
 *
 * @author Fernanda Santos
 */
    
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Retangulo r1 = new Retangulo();
            Retangulo r2 = new Retangulo();
            
            System.out.println("\n       DADOS DO RETANGULO 1     \n");
            System.out.print("Informe a largura: ");
            r1.setLargura(input.nextDouble());
            System.out.print("Informe a altura: ");
            r1.setAltura(input.nextDouble());
            
            System.out.println("\n       DADOS DO RETANGULO 2     \n");
            System.out.print("Informe a largura: ");
            r2.setLargura(input.nextDouble());
            System.out.print("Informe a altura: ");
            r2.setAltura(input.nextDouble());
            
           
            System.out.println("\n         RESULTADOS             \n");
            System.out.println("Retangulo 1:");
            System.out.println("Area: " + r1.getArea());
            System.out.println("Perimetro: " + r1.getPerimetro());
            
            System.out.println("\nRetangulo 2:");
            System.out.println("Area: " + r2.getArea());
            System.out.println("Perimetro: " + r2.getPerimetro());
        }
    }
}