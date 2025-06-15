package Exercicio01;

public class Retangulo {
    
    private double largura;
    private double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return largura * altura;
    }

    public double getPerimetro() {
        return 2 * (largura + altura);
    }
}
    
