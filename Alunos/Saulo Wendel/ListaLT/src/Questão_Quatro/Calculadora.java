package Questão_Quatro;

public class Calculadora {
    int a, b;
    double A, B, resultado;
    
   public Calculadora(){
      this.a = a;
      this.b = b;
      this.A = A;
      this.B = B;
      this.resultado = resultado;
}
    public int somar(int a, int b){
        resultado = a + b;
    return a + b;
    }
    public double somar(double A, double B){
        resultado = A + B;
        return A + B;
    }
    public int soma(int[] valores){
    int soma = 0;
    for(int valor : valores){
        soma += valor;
      
      }
    resultado = soma;
    return soma;
    } 
    
     public void ExibResul(){
     System.out.println("Resultado: " + resultado);
     }
  }

    

    

