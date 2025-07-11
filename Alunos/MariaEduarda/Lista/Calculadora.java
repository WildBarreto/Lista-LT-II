package Lista;

public class Calculadora {
    
    public Calculadora(){
}
    
    public void somar(int a, int b){
        System.out.println("Soma 1: " + (a + b));
    }
    
    public void somar(double a, double b){
        System.out.println("Soma 2: " + (a + b));
    }
    
    public void somar(int[] valores){
        
        int s = 0;
        for(int i = 0; i < valores.length; i++){
            s = s + valores[i];
        }
        
        System.out.println("Soma 3: "+ s);
    }
    
    public static void main(String[] args){
        
        Calculadora c1 = new Calculadora();
        c1.somar(3, 2);
        c1.somar(2.1, 3.4);
        int[] vetor = {1,2,3,4,5};
        c1.somar(vetor);
    }
    
}
