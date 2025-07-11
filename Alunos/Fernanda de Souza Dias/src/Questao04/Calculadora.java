package Questao04;

public class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }

    int somar(int[] valores) {
        int soma = 0;
        for (int v : valores) soma += v;
        return soma;
    }
}
