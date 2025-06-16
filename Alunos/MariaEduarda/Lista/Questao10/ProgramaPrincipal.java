package Lista.Questao10;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        
        Biblioteca b = new Biblioteca();

        //livros
        b.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", "111"));
        b.adicionarLivro(new Livro("O Pequeno Príncipe", "Saint-Exupéry", "222"));
        b.adicionarLivro(new Livro("1984", "George Orwell", "333"));

        //usuários
        Usuario u1 = new UsuarioComum("Wild", 1);
        Usuario u2 = new UsuarioPremium("Luciano", 2);

        b.adicionarUsuario(u1);
        b.adicionarUsuario(u2);

        b.emprestarLivro("111", 1);
        b.emprestarLivro("222", 1);
        b.emprestarLivro("333", 1);
        b.emprestarLivro("111", 2);
        b.emprestarLivro("222", 1);

        b.listarLivrosDisponiveis();

        b.devolverLivro("111");
        b.emprestarLivro("111", 2);

        b.mostrarLivrosUsuarios();
    }
}
