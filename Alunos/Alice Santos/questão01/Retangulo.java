package questão01;

public class Retangulo {
    
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

}