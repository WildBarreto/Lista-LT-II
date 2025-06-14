
package Questão1;


public class Retangulo {
    
    double largura;
    double altura;
    
    Retangulo(double largura, double altura){
    
    this.altura = altura;
    this.largura = largura;
    
    }
    
    double calcularArea (){
    return largura * altura;
    }
    
    double calcularPerimetro (){
    return 2* (largura + altura);
    
    }
    
}
