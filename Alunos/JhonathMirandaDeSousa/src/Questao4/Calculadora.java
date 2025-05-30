package Questao4;

public class Calculadora {
    
    //Métodos
    public int somar (int a, int b){
        return a + b;
    }
    
    public double somar (double a, double b){
        return a + b;
    }
    
    public int somar (int[] valores){ //Criação do array
        int soma = 0; //Criação do atributo "soma" e a incialização dele como "0".
        for(int valor : valores){ //Laço de repetição "for each".
            soma += valor; // soma = soma + valor.
        }
        return soma;
    }
}

//Entender melhor como funciona o array.