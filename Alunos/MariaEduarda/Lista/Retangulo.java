package Lista;
import java.util.Scanner;

public class Retangulo {
    
    double altura;
    double largura;
    
    public Retangulo(){  
    }
     
    public void Area(){
        System.out.println("\nA area é: "+ (altura * largura));
    }
    
    public void Perimetro(){
        System.out.println("O perimetro é: "+ (altura*2 + largura*2)+"\n");
    }
    
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        
        System.out.print("Digite a altura: ");
        r1.altura = sc.nextDouble();
        System.out.print("Digite a largura: ");
        r1.largura = sc.nextDouble();
        
        r1.Area();
        r1.Perimetro();
        
        ////////////////////////////////////////////////////
        
        Retangulo r2 = new Retangulo();
        
        System.out.print("Digite a altura: ");
        r2.altura = sc.nextDouble();
        System.out.print("Digite a largura: ");
        r2.largura = sc.nextDouble();
        
        r2.Area();
        r2.Perimetro();
          
    }
    
}
