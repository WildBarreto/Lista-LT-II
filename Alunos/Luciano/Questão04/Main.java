package Questão04;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
  
        int resultado1 = calc.somar(5, 10);
        System.out.println("Soma de dois inteiros: 5 + 10 = " +resultado1);
  
        double resultado2 = calc.somar(3.5, 2.7);
        System.out.println("Soma de dois doubles: 3.5 + 2.7 = " +resultado2);

        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros);
        System.out.println("Soma de um vetor de inteiros: 1 + 2 + 3 + 4 + 5 = " +resultado3);
    }
}

