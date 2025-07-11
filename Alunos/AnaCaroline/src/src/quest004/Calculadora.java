package quest004;

public class Calculadora {
    public void somar(int a, int b) {
        System.out.println(a + b);
    }

    public void somar (double a, double b) {
        System.out.println(a + b);
    }
    
    public void somar (int [] valores) {
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        System.out.println(soma);
    }

    public void somar (double a, int b) {
        System.out.println(a + b);
    }
}
