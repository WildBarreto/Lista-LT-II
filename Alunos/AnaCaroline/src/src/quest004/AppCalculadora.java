package quest004;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(1, 2);
        calculadora.somar(1.0, 2.0);
        calculadora.somar(new int[] {1, 2, 3});
        calculadora.somar(1.0, 2);
    }
}
