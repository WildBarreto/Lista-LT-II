package Questao04;

public class TestaCalculadoraMain {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(2.5, 4.1));
        System.out.println(calc.somar(new int[]{1, 2, 3, 4}));
    }
    
}
