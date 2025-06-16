package l.t.pkg2;

public class Produto implements Imprimivel{
    private String nome;
    private double valor;
    
    public Produto(){
        
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Produto: " + getNome() + "\nValor: " + getValor());
    }

    
}
