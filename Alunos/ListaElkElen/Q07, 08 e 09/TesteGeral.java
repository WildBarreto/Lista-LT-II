/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

import java.util.Scanner;

/**
 *
 * @author elkin
 */

public class TesteGeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Produto
        System.out.println("=== Cadastro de Produto ===");
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        Produto produto = new Produto(nomeProduto, precoProduto);

        // Funcionário
        System.out.println("\n=== Cadastro de Funcionário ===");
        System.out.print("Nome do funcionário: ");
        String nomeFunc = scanner.nextLine();
        System.out.print("CPF do funcionário: ");
        String cpfFunc = scanner.nextLine();
        System.out.print("Salário base do funcionário: ");
        double salarioFunc = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        Funcionario funcionario = new Funcionario(nomeFunc, cpfFunc, salarioFunc);

        // Documentos
        System.out.println("\n=== Cadastro de Documentos ===");
        System.out.print("Título do Relatório: ");
        String tituloRelatorio = scanner.nextLine();
        Relatorio relatorio = new Relatorio(tituloRelatorio);

        System.out.print("Título da Carta: ");
        String tituloCarta = scanner.nextLine();
        Carta carta = new Carta(tituloCarta);

        // Impressão e abertura
        System.out.println("\n=== Impressões ===");
        produto.imprimir();
        funcionario.imprimir();

        System.out.println("\n=== Abertura de Documentos ===");
        relatorio.abrir();
        carta.abrir();

        scanner.close();
    }
}