package l.t.pkg2;

public class Retangulo {
    
    private  double altura;
    private  double largura;

    public Retangulo(double altura, double peso) {
        this.altura = altura;
        this.largura = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
  
    public double calcularArea() {
        return largura * altura;
    }

    
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    
} 

