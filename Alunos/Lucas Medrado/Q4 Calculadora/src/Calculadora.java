import java.util.Scanner;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int[] valores) {
        int total = 0;
        for (int valor : valores) {
            total += valor;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite dois numeros inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Soma int: " + calc.somar(num1, num2));

        System.out.println("\nDigite dois numeros decimais:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println("Soma double: " + calc.somar(d1, d2));

        System.out.println("\nQuantos numeros quer somar no array?");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        System.out.println("Digite os " + tamanho + " numeros:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Soma array: " + calc.somar(numeros));

        scanner.close();
    }
}