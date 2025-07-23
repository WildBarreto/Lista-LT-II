package Questão04;

import Questão04.Calculadora;

public class MainTesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(10, 5); 
        double resultado2 = calc.somar(3.5, 7.8); 
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros); 

        System.out.println("Soma de 10 + 5 = " + resultado1);
        System.out.println("Soma de 3.5 + 7.8 = " + resultado2);
        System.out.println("Soma do array {1, 2, 3, 4, 5} = " + resultado3);
    }
}
