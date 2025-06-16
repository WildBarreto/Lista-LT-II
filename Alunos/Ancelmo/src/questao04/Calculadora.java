package questao04;

public class Calculadora {

    public double somar(int a, int b) {
        return (double) a + b;
    }

    public double somar(double a, double b) {
        return (a + b);
    }

    public double somar(int[] valores) {
        int soma = 0;
        for (int i : valores) {
            soma += i;
        }
        return (double) soma;
    }
    
}
