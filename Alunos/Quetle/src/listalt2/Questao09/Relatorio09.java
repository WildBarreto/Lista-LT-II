package listalt2.Questao09;


import listalt2.Questao09.Documento09;

public class Relatorio09 extends Documento09{
    private String conteudo;

    public Relatorio09(String conteudo, String titulo) {
        super(titulo);
        this.conteudo = conteudo;
    }
    
    @Override
    public void abrir(){
        System.out.println("Abrir Relatório: " +titulo);
        System.out.println("Conteúdo:");
        System.out.println(conteudo);
    }
}