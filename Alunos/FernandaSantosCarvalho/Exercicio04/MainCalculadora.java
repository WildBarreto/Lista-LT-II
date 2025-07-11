package Exercicio04;

/**
 *
 * @author Fernanda Santos
 */
public class MainCalculadora {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(10, 20);
        double resultado2 = calc.somar(5.5, 7.3);
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros);

        System.out.println("Soma de inteiros: " + resultado1);
        System.out.println("Soma de doubles: " + resultado2);
        System.out.println("Soma de array de inteiros: " + resultado3);
    }
}