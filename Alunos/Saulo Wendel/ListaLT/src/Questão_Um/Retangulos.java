package Questão_Um;

public class Retangulos {
    
    Float largura;
    Float altura;
    
    public Retangulos(Float largura, Float altura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public Float CalcArea(){
    return altura * largura;
    }
    public Float CalcPerimetro(){
    return 2 * (altura + largura);
    }
    
    public void ExibirAtributos() {
        System.out.println("Este retângulo tem largura = " + largura + " e altura = " + altura);
    }
}
