package Questao09;

public class TestandoTudoMain {

    public static void main(String[] args) {
        Imprimivel p = new Produto();
        Imprimivel f = new Funcionario();

        p.imprimir();
        f.imprimir();

        Documento relatorio = new Relatorio("Relatório de Vendas");
        Documento carta = new Carta("Carta para Cliente");

        relatorio.abrir();
        carta.abrir();
    }
    
}
