/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

/**
 *
 * @author elkin
 */
import java.util.Scanner;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("=== Cadastro de Usuários ===");
        System.out.print("Quantos usuários deseja cadastrar? ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtdUsuarios; i++) {
            System.out.println("\nUsuário #" + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            System.out.print("Tipo (1 - Comum / 2 - Premium): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo == 1) {
                biblioteca.adicionarUsuario(new UsuarioComum(nome, id));
            } else {
                biblioteca.adicionarUsuario(new UsuarioPremium(nome, id));
            }
        }

        System.out.println("\n=== Cadastro de Livros ===");
        System.out.print("Quantos livros deseja adicionar? ");
        int qtdLivros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtdLivros; i++) {
            System.out.println("\nLivro #" + (i + 1));
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            biblioteca.adicionarLivro(new Livro(titulo, autor, isbn));
        }

        // Simulando entrada de um usuário
        System.out.println("\n=== Entrar no sistema ===");
        System.out.print("Informe seu ID de usuário: ");
        int idLogado = scanner.nextInt();
        scanner.nextLine();

        Usuario usuario = biblioteca.buscarUsuarioPublico(idLogado);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        int opcao;
        do {
            System.out.println("\nBem-vindo, " + usuario.toString());
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Listar livros disponíveis");
            System.out.println("4. Ver meus livros emprestados");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ISBN do livro: ");
                    String isbnEmp = scanner.nextLine();
                    biblioteca.emprestarLivro(isbnEmp, usuario.getId());
                    break;
                case 2:
                    System.out.print("ISBN do livro a devolver: ");
                    String isbnDev = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDev, usuario.getId());
                    break;
                case 3:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 4:
                    System.out.println("\n=== Seus livros emprestados ===");
                    for (Livro l : usuario.getLivrosEmprestados()) {
                        System.out.println(l);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

