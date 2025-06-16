package l.t.pkg2;

public class Carta extends Documento{

    public Carta() {
    }

    public Carta(String titulo) {
        super(titulo);
    }
    
    @Override
    public void abrir(){
        System.out.println("Carta de titulo - " + titulo + " - aberta!");
    }
}