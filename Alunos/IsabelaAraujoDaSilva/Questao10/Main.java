package Questao10;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", "001");
        Livro l2 = new Livro("1984", "George Orwell", "002");
        Livro l3 = new Livro("A Revolução dos Bichos", "George Orwell", "003");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        Usuario u1 = new UsuarioComum("João", "U001");
        Usuario u2 = new UsuarioPremium("Maria", "U002");

        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        biblioteca.emprestarLivro("001", "U001");
        biblioteca.emprestarLivro("002", "U001");
        biblioteca.emprestarLivro("003", "U001"); 

        biblioteca.emprestarLivro("003", "U002"); 

        biblioteca.listarLivrosDisponiveis();
        biblioteca.relatorioStatus();

        biblioteca.devolverLivro("001");
        biblioteca.relatorioStatus();
    }
}
