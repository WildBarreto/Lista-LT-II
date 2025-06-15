package listalt2.Questao10;


import listalt2.Questao10.Usuarioc10;
import listalt2.Questao10.Usuariop10;
import listalt2.Questao10.Biblioteca10;
import listalt2.Questao10.Livro10;

public class Main10 {
    public static void main(String[] args){
        Biblioteca10 biblioteca = new Biblioteca10();
        
        biblioteca.adicionarLivro(new Livro10("Dom Casmurro", "Machado de Assis","1235678"));
        biblioteca.adicionarLivro(new Livro10("O Principe Cruel","Holly Back","1345688"));
        biblioteca.adicionarLivro(new Livro10("Harry Poter", "J.K Rowling","901345"));
        
        biblioteca.adicionarUsuario(new Usuarioc10("Quétle",1));
        biblioteca.adicionarUsuario(new Usuariop10("Elena",2));
        
        System.out.println("---Operação bibliotecaria---");
        
        System.out.println("\n * Empréstimo * ");
        boolean sucesso1 = biblioteca.EmprestarLivro("1235678", 1);
        System.out.println(sucesso1 ? "Emprestimo realizado!" : "Falha, tentar novamente!");
        
        System.out.println("\n * Empréstimo * "); 
        boolean sucesso2 = biblioteca.EmprestarLivro("1345688", 1);
        System.out.println(sucesso2 ? "Emprestimo realizado!" : "Falha, tentar novamente!");

        System.out.println("\n * Empréstimo * ");
        boolean sucesso3 = biblioteca.EmprestarLivro("901345", 1);
        System.out.println(sucesso3 ? "Emprestimo realizado!" : "Falha, tentar novamente!");
        
        System.out.println("\n * Empréstimo * ");
        boolean sucesso4 = biblioteca.EmprestarLivro("7755639", 1);
        System.out.println(sucesso4 ? "Emprestimo realizado!" : "Falha, tentar novamente!");
        
        System.out.println("\n * Empréstimo (usuário premium) * ");
        boolean sucesso5 = biblioteca.EmprestarLivro("44250679", 2);
        System.out.println(sucesso1 ? "Emprestimo realizado!" : "Falha, tentar novamente!");
        
        System.out.println("\n Devolver livro 123456: ");
        boolean devolucao = biblioteca.devolverLivro("123456");
        System.out.println(devolucao ? " Devolução feita" : "Falha, tentar novamente");
        
        biblioteca.listarStatus();    
    }
}
