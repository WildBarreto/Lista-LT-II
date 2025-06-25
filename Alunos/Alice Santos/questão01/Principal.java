package questão01;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("RETÂNGULO 01");
        System.out.print("DIGITE A LARGURA DO RETÂNGULO 01: ");
        double largura1 = scanner.nextDouble();
        System.out.print("DIGITE A ALTURA DO RETÂNGULO 01: ");
        double altura1 = scanner.nextDouble();

        Retangulo ret1 = new Retangulo(largura1, altura1);

        System.out.println("\nRETÂNGULO 02");
        System.out.print("DIGITE A LARGURA DO RETÂNGULO 02: ");
        double largura2 = scanner.nextDouble();
        System.out.print("DIGITE A ALTURA DO RETÂNGULO 02: ");
        double altura2 = scanner.nextDouble();

        Retangulo ret2 = new Retangulo(largura2, altura2);

        System.out.println("\nRESULTADOS");
        System.out.println("RETÂNGULO 01 | ÁREA: " + ret1.calcularArea() + " | PERÍMETRO: " + ret1.calcularPerimetro());
        System.out.println("RETÂNGULO 02 | ÁREA: " + ret2.calcularArea() + " | PERÍMETRO: " + ret2.calcularPerimetro());

        scanner.close();
    }
}