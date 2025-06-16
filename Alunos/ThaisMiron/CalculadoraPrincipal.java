package l.t.pkg2;

import java.util.Scanner;

public class CalculadoraPrincipal{
    public static void main(String[] args){
        
    Calculadora cal = new Calculadora();
    Scanner sc = new Scanner(System.in);
    
    int a;
    int b;
    double c;
    double d;
    
    System.out.println("Digite dois numeros inteiros:");
    a = sc.nextInt();
    b = sc.nextInt();
    int resultado1 = cal.somar(a ,b);
    
    System.out.println("Soma de inteiros:" + resultado1);

    
    System.out.println("Digite dois numeros para double:");
    c = sc.nextDouble();
    d = sc.nextDouble();
    double resultado2 = cal.somar(c , d);
    
    System.out.println("Soma de doubles:" + resultado2);

    
    System.out.println("\nQuantos números você deseja somar?");
    int quantidade = sc.nextInt();
    int[] numeros = new int[quantidade];
    for (int i = 0; i < quantidade; i++) {
    System.out.print("Digite o número " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
            
        System.out.println("Soma : " +cal.somar(numeros));
        }
        
    }
}
