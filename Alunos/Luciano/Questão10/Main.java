package Questão10;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        Livro l1 = new Livro("As Crônicas Nárnia", "C.S Lewis", "111");
        Livro l2 = new Livro("O Hobbit", "Tolkien", "222");
        Livro l3 = new Livro("Dom Casmurro", "Machado", "333");
        Livro l4 = new Livro("Cartas do Diabo para seu aprendiz", "C.S Lewis", "444");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.adicionarLivro(l4);

      
        Usuario u1 = new UsuarioComum("Luciano", "U01");
        Usuario u2 = new UsuarioPremium("Nágila", "U02");

        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

   
        biblioteca.emprestarLivro("111", "U01");
        biblioteca.emprestarLivro("222", "U01");
        biblioteca.emprestarLivro("333", "U01");
        biblioteca.emprestarLivro("444", "U01");

        biblioteca.emprestarLivro("444", "U02");

        biblioteca.devolverLivro("111"); 
        System.out.println("\nRelatório Final");
        biblioteca.listarLivrosDisponiveis();
    }
}
