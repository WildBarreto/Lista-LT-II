/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

public class Principal {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

       
        biblioteca.adicionarLivro(new Livro("Como eu era antes de voce", "Jojo Moyes", "101"));
        biblioteca.adicionarLivro(new Livro("O fatasma da Opera", "Gaston Leroux", "322"));
        biblioteca.adicionarLivro(new Livro("A Culpa é Das Estrelas", "Jhon Green", "566"));

     
        Usuario u1 = new UsuarioComum("Ana", 1);
        Usuario u2 = new UsuarioPremium("Lucas", 2);

        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        biblioteca.emprestarLivro("101", 1); 
        biblioteca.emprestarLivro("322", 1); 
        biblioteca.emprestarLivro("566", 1); 
        biblioteca.emprestarLivro("101", 2);

        biblioteca.devolverLivro("101");

        biblioteca.emprestarLivro("101", 2);

        
        biblioteca.listarLivrosDisponiveis();

        
        biblioteca.listarStatusUsuarios();
    }
}

    