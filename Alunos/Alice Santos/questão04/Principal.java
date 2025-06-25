package questão04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        int a, b;
        double c, d;

        System.out.println("DIGITE DOIS NÚMEROS INTEIROS: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("SOMA: " + calc.somar(a, b));

        System.out.println("\nDIGITE DOIS NÚMEROS DOUBLES: ");
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        System.out.println("SOMA: " + calc.somar(c, d));

        System.out.println("\nQUANTOS NÚMEROS VOCÊ QUER SOMAR? ");
        int x = scanner.nextInt();

        int lista[] = new int[x];

        System.out.println("\nDIGITE OS NÚMEROS: ");
        for (int i = 0; i < x; i++) {
            lista[i] = scanner.nextInt();
        }

        System.out.println("SOMA: " + calc.somar(lista));
        
        scanner.close();
    }
}