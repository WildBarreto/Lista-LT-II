package AnaHeloisia4info.questao10;

public class QuestaoMain {
    
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Java Básico", "Mauro Luiz", "ISBN001"));
        biblioteca.adicionarLivro(new Livro("POO Avançada", "Lorena Silva", "ISBN002"));
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados", "Pedro Lucas", "ISBN003"));
        biblioteca.adicionarLivro(new Livro("Banco de Dados", "Luiza Souza", "ISBN004"));

        //usuários
        biblioteca.adicionarUsuario(new UsuarioComum("Lauro", "U001"));
        biblioteca.adicionarUsuario(new UsuarioPrem("Laura", "U002"));

        //livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        //empréstimos
        biblioteca.emprestarLivro("ISBN001", "U001"); //Mauro
        biblioteca.emprestarLivro("ISBN002", "U001");
        biblioteca.emprestarLivro("ISBN003", "U001");
        biblioteca.emprestarLivro("ISBN004", "U001"); //(limite)

        biblioteca.emprestarLivro("ISBN004", "U002"); //Laura (premium, sem limite)

        biblioteca.listarLivrosDisponiveis();

        biblioteca.devolverLivro("ISBN002");

        biblioteca.listarLivrosDisponiveis();
    }
}
