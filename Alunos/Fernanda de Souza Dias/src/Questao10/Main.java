package Questao10;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "123"));
        biblioteca.adicionarLivro(new Livro("A Moreninha", "Joaquim Manuel", "456"));
        biblioteca.adicionarLivro(new Livro("Capitães da Areia", "Jorge Amado", "789"));

        Usuario u1 = new UsuarioComum("Fernanda", 1);
        Usuario u2 = new UsuarioPremium("Carlos", 2);
        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        System.out.println("Livros disponíveis:");
        biblioteca.listarLivrosDisponiveis();

        biblioteca.emprestarLivro("123", 1); 
        biblioteca.emprestarLivro("456", 1); 
        biblioteca.emprestarLivro("789", 1); 
        biblioteca.emprestarLivro("123", 1); 

        biblioteca.devolverLivro("123");

        System.out.println("\nLivros disponíveis após operações:");
        biblioteca.listarLivrosDisponiveis();
    }
    
}
