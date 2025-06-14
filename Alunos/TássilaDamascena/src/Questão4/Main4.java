
package Questão4;

import java.util.Scanner;

public class Main4 {
    public static void main (String[]args){
    
    Scanner input = new Scanner(System.in);
    
    Calculadora calculo = new Calculadora();
    
        System.out.println("Digite um numero inteiro: ");
        int a = input.nextInt();
        System.out.println("Digite um segundo numero inteiro: ");
        int b = input.nextInt();
        System.out.println("\nSoma dos numeros inteiros: " + calculo.somar(a, b));
        
        System.out.println("\nDigite um numero decimal: ");
        double c = input.nextDouble();
        System.out.println("Digite um segundo numero decimal: ");
        double d = input.nextDouble();
        System.out.println("\nSoma dos numeros decimais: " + calculo.somar(c, d));
        
        System.out.print("\nQuantos numeros inteiros deseja somar no array? ");
        int n = input.nextInt();
        int[] valores = new int[n];

            for (int i = 0; i < n; i++) {
        System.out.print("Digite o valor " + (i + 1) + ": ");
        valores[i] = input.nextInt();
        
        }

        System.out.println("Soma dos valores do array: " + calculo.somar(valores));

    
    }
    
}
