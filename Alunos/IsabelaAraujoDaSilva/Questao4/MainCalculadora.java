package Questao4;

public class MainCalculadora {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        int resultadoInteiros = calculadora.somar(4, 9);
        System.out.println("Soma de inteiros: " + resultadoInteiros);

    
        double resultadoFracionarios = calculadora.somar(4.3, 6.7);
        System.out.println("Soma de fracionários: " + resultadoFracionarios);

       
        int[] numeros = {1, 2, 3, 4, 5};
        int resultadoArray = calculadora.somar(numeros);
        System.out.println("Soma de array: " + resultadoArray);
    }
}
