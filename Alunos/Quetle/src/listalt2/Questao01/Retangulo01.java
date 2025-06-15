package listalt2.Questao01;

import java.util.Scanner;

public class Retangulo01 {    
    double largura;
    double altura;

    public Retangulo01(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double CalcularArea(){
        return largura*altura;
    }
    public double CalcularPerimetro(){
        return 2 *(largura + altura);
    }
    
     public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("--- 1° RETÂNGULO--- ");
        System.out.println("Digite a largura: ");
        double l1 = ler.nextDouble();
        System.out.println("Digite a altura: ");
        double a1 = ler.nextDouble();
        Retangulo01 retangulo1 = new Retangulo01(l1,a1);
        
        System.out.println("--- 2° RETÂNGULO--- ");
        System.out.println("Digite a largura: ");
        double l2 = ler.nextDouble();
        System.out.println("Digite a altura: ");
        double a2 = ler.nextDouble();
        Retangulo01 retangulo2 = new Retangulo01(l2,a2);
        
        System.out.println("=== RETÂNGULOS ===");
        System.out.println("\n 1° Retângulo ");
        System.out.println("Largura: " +retangulo1.largura);
        System.out.println("Altura: " +retangulo1.altura);
        System.out.println("Área:  " +retangulo1.CalcularArea());
        System.out.println("Perímetro: " +retangulo1.CalcularPerimetro());
        
        System.out.println("\n 2° Retângulo ");
        System.out.println("Largura: " +retangulo2.largura);
        System.out.println("Altura: " +retangulo2.altura);
        System.out.println("Área:  " +retangulo2.CalcularArea());
        System.out.println("Perímetro: " +retangulo2.CalcularPerimetro());  
        }
}
    
    
  