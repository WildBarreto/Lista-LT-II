
package Questão10;

public class Main10 {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Trono de Vidro (Vol. 1)", "Sarah J. Maas", "392"));
        biblioteca.adicionarLivro(new Livro("O Principe Cruel", "Holly Black", "322"));
        biblioteca.adicionarLivro(new Livro("De Sangue e Cinzas", "Jennifer L. Armentrout", "588"));

        biblioteca.adicionarUsuario(new UsuarioComum("Tassila", "u1"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Ana Luisa", "u2"));

        biblioteca.emprestarLivro("392", "u1");
        biblioteca.emprestarLivro("322", "u1");
        biblioteca.emprestarLivro("588", "u1"); 
        biblioteca.emprestarLivro("456", "u1"); // tentaviva de pegar mais um
    
        biblioteca.emprestarLivro("588", "u1"); // recusa

        biblioteca.emprestarLivro("588", "u2"); // disponibiliza

        biblioteca.devolverLivro("392");

        System.out.println();
        biblioteca.listarLivrosDisponiveis();
        System.out.println();
        biblioteca.listarUsuarios();
    }
}

