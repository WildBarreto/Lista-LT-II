package Exercicio10;

/**
 *
 * @author Fernanda Santos
 */
public class MainBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        
        biblioteca.adicionarLivro(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", "12345"));
        biblioteca.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "67890"));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "11223"));

    
        UsuarioComum maria = new UsuarioComum("Maria", 1);
        UsuarioPremium joao = new UsuarioPremium("Joao", 2);

        biblioteca.adicionarUsuario(maria);
        biblioteca.adicionarUsuario(joao);

   
        System.out.println("\n=== Biblioteca: Lista de livros disponiveis inicialmente ===\n");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n=== Emprestimo de livros ===\n");
        
        System.out.println("Usuario comum Maria (ID: 1) tenta pegar 'O Senhor dos Aneis':");
        biblioteca.emprestarLivro("12345", 1);

        System.out.println("\nUsuario comum Maria tenta pegar 'Harry Potter e a Pedra Filosofal':");
        biblioteca.emprestarLivro("67890", 1);

        System.out.println("\nUsuario comum Maria tenta pegar 'Dom Casmurro':");
        biblioteca.emprestarLivro("11223", 1);

      
        System.out.println("\nUsuario premium Joao (ID: 2) tenta pegar 'Dom Casmurro':");
        biblioteca.emprestarLivro("11223", 2);

        
        System.out.println("\n=== Estado atual dos livros ===\n");
        biblioteca.listarEstadoLivros();

      
        System.out.println("\n=== Devolucao ===\n");
        System.out.println("Usuario Maria devolve 'Harry Potter e a Pedra Filosofal':");
        biblioteca.devolverLivro("67890");
        System.out.println("Devolucao realizada com sucesso.");

       
        System.out.println("\n=== Lista de livros disponiveis apos devolucao ===\n");
        biblioteca.listarLivrosDisponiveis();
    }
}