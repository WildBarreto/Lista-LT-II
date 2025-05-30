package Questao4;

public class MainCalculadora {
    public static void main (String []args){
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma de inteiros: " + calc.somar(4, 9));
        System.out.println("Soma de fracionarios: " + calc.somar(4.3, 6.7));
        System.out.println("Soma de array: " + calc.somar(new int[]{1, 2, 3, 4, 5}));
    }
}