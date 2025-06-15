package Questao9;

/**
 *
 * @author jjhon
 */
 public class Main {

    public static void main(String[] args) {
  
        Produto p = new Produto("Caneca personalizada", 29.90);
        p.imprimir();


        Funcionario f = new Funcionario("João Silva", "Designer");
        f.imprimir();

        Documento relatorio = new Relatorio("Vendas Mensais");
        Documento carta = new Carta("Carta de Boas-vindas");

        relatorio.abrir();
        carta.abrir();
    }
}
