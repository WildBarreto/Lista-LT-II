package Questao10;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", "001");
        Livro l2 = new Livro("1984", "George Orwell", "002");
        Livro l3 = new Livro("A Revolução dos Bichos", "George Orwell", "003");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        // Criando usuários
        Usuario u1 = new UsuarioComum("João", "U001");
        Usuario u2 = new UsuarioPremium("Maria", "U002");

        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        // Operações de empréstimo
        biblioteca.emprestarLivro("001", "U001");
        biblioteca.emprestarLivro("002", "U001");
        biblioteca.emprestarLivro("003", "U001"); // Deve falhar, limite do usuário comum

        biblioteca.emprestarLivro("003", "U002"); // Usuário premium pode pegar

        // Listagem e relatório
        biblioteca.listarLivrosDisponiveis();
        biblioteca.relatorioStatus();

        // Devolver livro
        biblioteca.devolverLivro("001");
        biblioteca.relatorioStatus();
    }
}
