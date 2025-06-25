package questão09;

public class Relatorio extends Documento {

    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("ABRINDO RELATÓRIO: " + titulo.toUpperCase());
        System.out.println("EXIBINDO DADOS ESTATÍSTICOS...");
    }
}