package l.t.pkg2;

import java.util.Scanner;

public class PrincipalQ10 {

    public static void main(String[] args) {
         Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("________________Biblioteca________________\n");
        
        System.out.println("Quantidade de livros que deseja cadastrar: ");
        int x = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("_______________Livros_______________\n");
        
        for(int i=0; i<x; i++){
            System.out.print("Titulo do Livro: ");
            String titulo = sc.nextLine();
            System.out.print("Nome do Autor: ");
            String autor = sc.nextLine();
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            
            Livro livro = new Livro(titulo, autor, isbn, false);
            
            biblioteca.adicionarLivro(livro);
        }
        
        System.out.println("Quantidade de usuarios que deseja cadastrar: ");
        int y = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<y;i++){
            System.out.println("Usuário comum: 1 | Usuario premium:2 ");
            int z = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            if(z == 1){
                UsuarioPremium up = new UsuarioPremium(nome, id);
                biblioteca.adicionarUsuario(up);
            }
            if(z==2){
                UsuarioComum uc = new UsuarioComum(nome, id);
                biblioteca.adicionarUsuario(uc);
            }
            
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        System.out.println("\n*************************************");
        
        System.out.print("Digite a quantidade de livros pegos: ");
        int sn = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<sn; i++){
            
            System.out.print("Digite o id do usuário: ");
            String id = sc.nextLine();
            System.out.print("Digite o isbn do livro: ");
            String isbn = sc.nextLine();
            biblioteca.emprestarLivro(isbn, id);
           
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        System.out.println("\n*************************************");
        
        System.out.print("Quantidade de livros devolvidos: ");
        sn = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<sn; i++){
            System.out.print("Digite o isbn do livro: ");
            String isbn = sc.nextLine();
            biblioteca.devolverLivro(isbn);
            
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        
    }
}
