package listalt2.Questao09;


import listalt2.Questao09.Documento09;

public class Carta09 extends Documento09{
    private String remetente;
    private String destinatario; 

    public Carta09(String remetente, String destinatario, String titulo) {
        super(titulo);
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    @Override
    public void abrir() {
       System.out.println("Abrir Carta: " +titulo);
       System.out.println("De: " +remetente);
       System.out.println("Para: " +destinatario);
    }    
}

