package Questão09;

public class Main {

    public static void main(String[] args) {
        imprimivel p = new Produto();
        imprimivel f = new Funcionario();

        p.imprimir();
        f.imprimir();

        Documento relatorio = new Relatorio("Relatório de Vendas");
        Documento carta = new Carta("Carta para Cliente");

        relatorio.abrir();
        carta.abrir();
    }
    
}
