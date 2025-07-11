class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a largura do primeiro retangulo:");
        double largura1 = scanner.nextDouble();
        System.out.println("Digite a altura do primeiro retangulo:");
        double altura1 = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(largura1, altura1);

        System.out.println("Digite a largura do segundo retangulo:");
        double largura2 = scanner.nextDouble();
        System.out.println("Digite a altura do segundo retangulo:");
        double altura2 = scanner.nextDouble();
        Retangulo retangulo2 = new Retangulo(largura2, altura2);

        System.out.println("Retangulo 1 - Area: " + retangulo1.calcularArea() + " Perimetro: " + retangulo1.calcularPerimetro());
        System.out.println("Retangulo 2 - Area: " + retangulo2.calcularArea() + " Perimetro: " + retangulo2.calcularPerimetro());
    }
}