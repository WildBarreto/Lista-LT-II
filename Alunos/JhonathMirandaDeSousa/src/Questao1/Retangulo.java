package Questao1;

class Retangulo {
    //Atributos
    double largura;
    double altura;
    
    //Construtor
    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    //Método para calcular área
    double calcularArea(){
        return largura * altura;
    }
    
    //Método para calcular perímetro
    double calcularPerimetro(){
        return 2 * (largura + altura);
    }
}    