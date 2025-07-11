package Questao1;

class Retangulo {
    
    double largura;
    double altura;

    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    double calcularArea(){
        return largura * altura;
    }

    double calcularPerimetro(){
        return 2 * (largura + altura);
    }
    
}    