package Exercicio09;

/**
 *
 * @author Fernanda Santos
 */
public class Main {
    public static void main(String[] args) {
       
        Imprimivel prod = new Produto("Teclado Gamer", 149.99);
        Imprimivel func = new Funcionario("Gabriel", "Suporte Tecnico");

        prod.imprimir();
        func.imprimir();

        System.out.println();

        Documento rel = new Relatorio("Relatorio de Vendas");
        Documento carta = new Carta("Carta de Apresentacao");

        rel.abrir();
        carta.abrir();
    }
}
