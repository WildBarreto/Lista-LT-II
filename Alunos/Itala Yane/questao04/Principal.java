/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

/**
 *
 * @author curso
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Calculadora calculo =  new Calculadora();
        
        int somar = calculo.somar(8, 10);
        System.out.println("A soma dos numeros inteiros sao: " +somar);
        
        double somar1 = calculo.somar(6.3, 3.6);
        System.out.println("\nA soma dos numeros decimais sao: " +somar1);
        
        
        int[] valores = {2, 4, 6, 2, 3, 10};
        int valor = calculo.somar(valores);
        System.out.println("\nA soma dos numeros do array é : " +valor);
}
    
}
