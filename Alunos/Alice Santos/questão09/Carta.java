package questão09;

public class Carta extends Documento {

    public Carta(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("ABRINDO CARTA: " + titulo.toUpperCase());
        System.out.println("EXIBINDO MENSAGEM PESSOAL...");
    }
}