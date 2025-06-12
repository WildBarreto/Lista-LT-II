package AnaHeloisia4info.questao4;

public class Calculadora{
    
    public int somar (int a, int b){
        
        return a + b;
    }
    
    public double somar (double a, double b){
        
        return a + b;
    }
    
    public int somar (int [] valores){
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(5, 7);
        System.out.println("Soma de dois inteiros: " + resultado1);

        double resultado2 = calc.somar(5.5, 7.3);
        System.out.println("Soma de dois doubles: " + resultado2);

        int[] numeros = {1, 2, 3, 4, 5};
        int resultado3 = calc.somar(numeros);
        System.out.println("Soma de um array de inteiros: " + resultado3);
    }
}
