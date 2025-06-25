package questão09;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" === PRODUTO === ");
        System.out.print("DIGITE O NOME DO PRODUTO: ");
        String nomeProduto = sc.nextLine();
        System.out.print("DIGITE O PREÇO DO PRODUTO: ");
        double precoProduto = sc.nextDouble();
        sc.nextLine();

        Produto produto = new Produto(nomeProduto, precoProduto);

        System.out.println("\n=== FUNCIONÁRIO ===");
        System.out.print("DIGITE O NOME DO FUNCIONÁRIO: ");
        String nomeFunc = sc.nextLine();
        System.out.print("DIGITE O CPF DO FUNCIONÁRIO: ");
        String cpfFunc = sc.nextLine();
        System.out.print("DIGITE O SALÁRIO DO FUNCIONÁRIO: ");
        double salarioFunc = sc.nextDouble();
        sc.nextLine();

        Funcionario funcionario = new Funcionario(nomeFunc, cpfFunc, salarioFunc);

        System.out.println("\n=== RELATÓRIO ===");
        System.out.print("DIGITE O TÍTULO DO RELATÓRIO: ");
        String tituloRelatorio = sc.nextLine();

        Relatorio relatorio = new Relatorio(tituloRelatorio);

        System.out.println("\n=== CARTA ===");
        System.out.print("DIGITE O TÍTULO DA CARTA: ");
        String tituloCarta = sc.nextLine();

        Carta carta = new Carta(tituloCarta);

        System.out.println("\n=== IMPRIMINDO OBJETOS ===");
        produto.imprimir();
        System.out.println();
        funcionario.imprimir();

        System.out.println("\n=== ABRINDO DOCUMENTOS ===");
        relatorio.abrir();
        System.out.println();
        carta.abrir();

        sc.close();
    }
}
