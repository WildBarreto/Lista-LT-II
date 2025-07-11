package Exercicio04;

/**
 *
 * @author Fernanda Santos
 */
public class Calculadora {

    // Soma dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Soma dois valores double
    public double somar(double a, double b) {
        return a + b;
    }

    // Soma um array de inteiros
    public int somar(int[] valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma;
    }
}
