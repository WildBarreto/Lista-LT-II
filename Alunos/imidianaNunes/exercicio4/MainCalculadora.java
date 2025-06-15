package exercicio4;

import exercicio4.Calculadora;

/**
 *
 * @author imidi
 */
public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(6, 7);
        System.out.println("Soma de inteiros: " + resultado1);

        double resultado2 = calc.somar(7.5, 4.3);
        System.out.println("Soma de doubles: " + resultado2);

        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros);
        System.out.println("Soma de array de inteiros: " + resultado3);
    }
    
}
