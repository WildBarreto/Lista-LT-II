package quest010;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        // sem criatividade para escolher os nomes do livros.
        biblioteca.adicionarLivro(new Livro("Livro 1", "Wild", "001"));
        biblioteca.adicionarLivro(new Livro("Livro 2", "Renan", "002"));
        biblioteca.adicionarLivro(new Livro("Livro 3", "Lucas", "003"));
        biblioteca.adicionarLivro(new Livro("Livro 4", "Luciano", "004"));

        
        Usuario u1 = new UsuarioComum("Keila", "u001");     
        Usuario u2 = new UsuarioPremium("Wallace", "u002");
        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        // Testezinhos
        biblioteca.emprestarLivro("001", "u001"); // é pra ir
        biblioteca.emprestarLivro("002", "u001"); // é pra ir
        biblioteca.emprestarLivro("003", "u001"); // é pra ir
        biblioteca.emprestarLivro("004", "u001"); // n é pra ir pq 4 livros é só pra quem e vip

        biblioteca.emprestarLivro("003", "u002"); // n é pra ir pq olivro já foi emprestado pra alguem
        biblioteca.emprestarLivro("004", "u002"); // é pra ir

        System.out.println("\nLivros disponíveis:");
        biblioteca.listarLivrosDisponiveis();

        // Mostrar status dos usuários
        System.out.println("\nStatus dos usuários:");
        System.out.println(u1);
        System.out.println(u2);
    }
}
