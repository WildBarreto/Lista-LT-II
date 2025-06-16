package Lista.Questao9;

public class Relatorio extends Documento {
    
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("\nAbrindo relatorio: " + titulo);
    }
}
