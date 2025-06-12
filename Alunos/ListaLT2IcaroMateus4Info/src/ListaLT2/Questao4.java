package ListaLT2;

public class Questao4 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes com sobrecarga
        int resultado1 = calc.somar(20, 20);
        double resultado2 = calc.somar(4.5, 2.2);
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros);

        System.out.println("Soma de int: " + resultado1);
        System.out.println("Soma de double: " + resultado2);
        System.out.println("Soma de array: " + resultado3);
    }
}

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int[] valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma;
    }
}