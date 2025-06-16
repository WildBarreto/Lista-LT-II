package l.t.pkg2;

public class Relatorio extends Documento{

    public Relatorio() {
    }

    public Relatorio(String titulo) {
        super(titulo);
    }
    
    @Override
    public void abrir(){
        System.out.println("Relatório de titulo - " + titulo + " - aberto!");
    }

}
