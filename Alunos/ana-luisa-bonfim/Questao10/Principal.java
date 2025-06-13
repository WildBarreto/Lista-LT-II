/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

/**
 *
 * @author analu
 */
public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addLivro(new Livro("1984", "George Orwell", "001-00", false));
        biblioteca.addLivro(new Livro("Dom Casmurro", "Machado de Assis", "002-70", false));
        biblioteca.addLivro(new Livro("O Hobbit", "Tolkien", "003-85", false));
        biblioteca.addLivro(new Livro("Vidas Secas", "Gaciliano Ramos", "004-44", false));
        biblioteca.addLivro(new Livro("A Hora da Estrela", "Clarice Lispector", "005-05", false));
        biblioteca.addLivro(new Livro("O Guarani", "Jose de Alencar", "006-65", false));
        biblioteca.addLivro(new Livro("Os Sertoes", "Euclides da Cunha", "007-77", false));
        
        Usuario u1 = new UsuarioComum("Maria", "U01");
        Usuario u2 = new UsuarioPremium("Joao", "U02");

        biblioteca.addUsuario(u1);
        biblioteca.addUsuario(u2);

        System.out.println("---O usuario 1 (comum) pega emprestado alguns livros---");
        biblioteca.emprestar("001-00", "U01");
        biblioteca.emprestar("002-70", "U01");
        biblioteca.emprestar("003-85", "U01");
        
        System.out.println("\nEm seguida, ele tenta pegar mais um, alem do seu limite permitido:");
        biblioteca.emprestar("004-44", "U01");
        
        System.out.println("\n---O Usuario 2 (premium) pega emprestado alguns livros---");
        biblioteca.emprestar("004-44", "U02");
        biblioteca.emprestar("005-05", "U02");
        biblioteca.emprestar("006-65", "U02");
        biblioteca.emprestar("007-77", "U02");
        
        System.out.println("\nPorem, ele tenta pegar um livro que nao esta disponivel:");
        biblioteca.emprestar("001-00", "U02");

        biblioteca.listarLivros();
        
        System.out.println("\nO Usuario 1 faz a devolucao de 1 livro:");
        biblioteca.devolver("001-00");

        biblioteca.listarLivros();
    }
}
