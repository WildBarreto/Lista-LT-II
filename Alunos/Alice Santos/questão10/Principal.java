package questão10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Biblioteca biblioteca = new Biblioteca();
            
            System.out.println("\nQUANTOS LIVROS VOCÊ QUER CADASTRAR?");
            int qtdLivros = Integer.parseInt(sc.nextLine());
            
            for (int i = 0; i < qtdLivros; i++) {
                System.out.println("\nDIGITE O TÍTULO DO LIVRO " + (i+1) + ":");
                String titulo = sc.nextLine();
                
                System.out.println("DIGITE O AUTOR DO LIVRO " + (i+1) + ":");
                String autor = sc.nextLine();
                
                System.out.println("DIGITE O ISBN DO LIVRO " + (i+1) + ":");
                String isbn = sc.nextLine();
                
                Livro livro = new Livro(titulo, autor, isbn);
                biblioteca.adicionarLivro(livro);
                System.out.println("\nLIVRO CADASTRADO!!!\n");
            }
            
            System.out.println("\nQUANTOS USUÁRIOS VOCÊ QUER CADASTRAR?");
            int qtdUsuarios = Integer.parseInt(sc.nextLine());
            
            for (int i = 0; i < qtdUsuarios; i++) {
                System.out.println("\nDIGITE O NOME DO USUÁRIO " + (i+1) + ":");
                String nome = sc.nextLine();
                
                System.out.println("DIGITE O ID DO USUÁRIO " + (i+1) + ":");
                String id = sc.nextLine();
                
                System.out.println("DIGITE O TIPO DO USUÁRIO (1 PARA USUÁRIO COMUM, 2 PARA USUÁRIO PREMIUM):");
                int tipo = Integer.parseInt(sc.nextLine());
                
                Usuario usuario;
                if (tipo == 1) {
                    usuario = new UsuarioComum(nome, id);
                } else {
                    usuario = new UsuarioPremium(nome, id);
                }
                biblioteca.adicionarUsuario(usuario);
                System.out.println("\nUSUÁRIO CADASTRADO!\n");
            }
            
            boolean rodando = true;
            while (rodando) {
                System.out.println("\nESCOLHA UMA OPÇÃO:");
                System.out.println("1 - EMPRESTAR LIVRO");
                System.out.println("2 - DEVOLVER LIVRO");
                System.out.println("3 - LISTAR LIVROS DISPONÍVEIS");
                System.out.println("4 - LISTAR USUÁRIOS");
                System.out.println("0 - SAIR");
                System.out.print("OPÇÃO: ");
                
                int opcao = Integer.parseInt(sc.nextLine());
                
                switch (opcao) {
                    case 1 -> {
                        System.out.println("DIGITE O ISBN DO LIVRO:");
                        String isbnEmprestimo = sc.nextLine();
                        System.out.println("DIGITE O ID DO USUÁRIO:");
                        String usuarioIdEmprestimo = sc.nextLine();
                        biblioteca.emprestarLivro(isbnEmprestimo, usuarioIdEmprestimo);
                    }
                    case 2 -> {
                        System.out.println("DIGITE O ISBN DO LIVRO PARA DEVOLUÇÃO:");
                        String isbnDevolucao = sc.nextLine();
                        biblioteca.devolverLivro(isbnDevolucao);
                    }
                    case 3 -> biblioteca.listarLivrosDisponiveis();
                    case 4 -> biblioteca.listarUsuarios();
                    case 0 -> {
                        rodando = false;
                        System.out.println("\nSAINDO...");
                    }
                    default -> System.out.println("OPÇÃO INVÁLIDA!");
                }
            }
        }
    }
}
