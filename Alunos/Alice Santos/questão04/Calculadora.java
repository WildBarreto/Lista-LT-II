package questão04;

public class Calculadora {

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
