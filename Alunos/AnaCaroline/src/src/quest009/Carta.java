package quest009;

public class Carta extends Documento {

    public Carta(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo carta: " + titulo);
    }
}
