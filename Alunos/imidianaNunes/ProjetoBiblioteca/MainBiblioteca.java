package ProjetoBiblioteca;

/**
 *
 * @author imidi
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        Livro livro1 = new Livro("1984", "George Orwell", "111");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "222");
        Livro livro3 = new Livro("A Revolucao dos Bichos", "George Orwell", "333");
        Livro livro4 = new Livro("O Cortico", "Aluisio Azevedo", "444");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // Adicionando usuários
        Usuario usuario1 = new UsuarioComum("Alice", 1);
        Usuario usuario2 = new UsuarioPremium("Bruno", 2);

        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        // Empréstimos válidos
        biblioteca.emprestarLivro("111", 1); // Alice
        biblioteca.emprestarLivro("222", 1);
        biblioteca.emprestarLivro("333", 1);

        // Tentativa de ultrapassar limite (usuário comum)
        biblioteca.emprestarLivro("444", 1); // deve falhar

        // Usuário premium emprestando
        biblioteca.emprestarLivro("444", 2); // deve funcionar

        // Listar livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Devolução
        biblioteca.devolverLivro("111");

        // Listar novamente após devolução
        biblioteca.listarLivrosDisponiveis();
    }
}
