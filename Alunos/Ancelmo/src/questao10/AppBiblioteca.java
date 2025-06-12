package questao10;

import java.util.ArrayList;

public class AppBiblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", "493149892121", false));
        livros.add(new Livro("Brás Cubas", "Machado de Assis", "492523292121", false));
        livros.add(new Livro("Gabriela, Cravo e Canela", "Jorge Amado", "4942422321", false));
        livros.add(new Livro("Vidas Secas", "Graciliano Ramos", "491431314125", false));
        livros.add(new Livro("Quincas Borba", "Machado de Assis", "523575332121", false));

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new UsuarioComum("Ancelmo Augusto"));
        usuarios.add(new UsuarioPremium("Kaio Menandro"));
        usuarios.add(new UsuarioPremium("Laila Bacelar"));
        usuarios.add(new UsuarioPremium("Wild Barreto"));
        usuarios.add(new UsuarioComum("Luciano Eloi"));

        Biblioteca b = new Biblioteca(livros, usuarios);

        // Empréstimos
        b.emprestarLivro("493149892121", 1);
        b.emprestarLivro("491431314125", 3);
        b.emprestarLivro("523575332121", 4);

        b.devolverLivro("523575332121");

        b.emprestarLivro("523575332121", 2);

        b.listarLivrosDisponiveis();

    }
}
