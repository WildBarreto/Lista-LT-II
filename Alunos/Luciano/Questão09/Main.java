package Questão09;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00);
        Funcionario funcionario = new Funcionario("Luciano", "Gerente");

        produto.imprimir();
        funcionario.imprimir();

        Documento relatorio = new Relatorio("Relatório Financeiro");
        Documento carta = new Carta("Carta de Demissão");

        relatorio.abrir();
        carta.abrir();
    }
}