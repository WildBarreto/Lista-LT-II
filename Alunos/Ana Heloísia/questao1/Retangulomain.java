package AnaHeloisia4info.questao1;
import java.util.Scanner;

public class Retangulomain {
    
    public static void main(String[] args) {
    
    Scanner p = new Scanner(System.in);
    
    System.out.println("Retangulo 1:");
    System.out.println("Digite Largura:");
    double largura1 = p.nextDouble();
    
    System.out.println("Digite Altura:");
    double altura1 = p.nextDouble();
    
    Retangulo ret1 = new Retangulo(largura1, altura1);
    ret1.largura = largura1;
    ret1.altura = altura1;
    
    ret1.calculararea();
    
    System.out.println("\nArea do retangulo 1: " +ret1.calculararea());
    System.out.println("Perimetro do retangulo 1: " +ret1.calcularperimetro());
    
    //retangulo2
    System.out.println("\n\nRetangulo 2:");
    System.out.println("Digite Largura:");
    double largura2 = p.nextDouble();
    
    System.out.println("Digite Altura:");
    double altura2 = p.nextDouble();
    
    Retangulo ret2 = new Retangulo(largura2, altura2);
    ret1.largura = largura2;
    ret1.altura = altura2;
    
    ret1.calculararea();
    
    System.out.println("\nArea do retangulo 2: " +ret2.calculararea());
    System.out.println("Perimetro do retangulo 2: " +ret2.calcularperimetro());
        
    }
}