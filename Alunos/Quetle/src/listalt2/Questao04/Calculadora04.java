package listalt2.Questao04;

public class Calculadora04 {
   public int a;
   public int b;
   
  public int somar(int a, int b){
    return a + b;
}
  public double somar(double a, double b){
    return a + b;
  }
  public int somar(int[]valores){
      int um = 0;
      for (int valor : valores){
          um += valor;
      }
      return um;
  }
   public static void main(String[]args){
      Calculadora04 calcular = new Calculadora04();
       
      int result01 = calcular.somar(3, 5);
      System.out.println("A soma dos inteiros (3 + 5) é: " +result01);
      double result02 = calcular.somar(5.5, 3.3);
      System.out.println("As somas de descimais (5.5 + 3.3) é: " +result02);
      int[] num = {1, 2, 3, 4, 5, 6};
      int result03 = calcular.somar(num);
      System.out.println("A soma dos números 1+2+3+4+5+6 é: " +result03);
   } 
}
