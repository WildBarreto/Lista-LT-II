package l.t.pkg2;

import java.util.ArrayList;

public class Biblioteca {
    
    private final ArrayList<Livro> livros;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public Usuario encontrarUsuario(String id){
        for(Usuario u : usuarios){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }
    
    public Livro encontrarLivro(String isbn){
        for (Livro l : livros){
            if(l.getIsbn().equals(isbn)){
                return l;
            }
        }
        return null;
    }
    
    public void emprestarLivro(String isbn, String id){
        Usuario u = encontrarUsuario(id);
        Livro l = encontrarLivro(isbn);
        
        if(u == null || l == null){
            System.out.println("Usuario ou livro nao encontrado no sistema!");
            return;
        }
        if (l.isEmprestado()){
            System.out.println("Atencao: Esse livro ja esta emprestado!");
            return;
        }
        if(!u.estaAptoparaEmprestimo()){
            System.out.println("Empréstimo não permitido: limite de livros atingido.");
            return;
        }
        
        l.setEmprestado(true);
        u.pegarEmprestado(l);
        System.out.println("O livro: "+ l.getTitulo() +" foi emprestado a " + u.getNome());
        
        
    }
    
    public void devolverLivro(String isbn){
        Livro l = encontrarLivro(isbn);
        
        if(l==null || !l.isEmprestado()) {
            System.out.println("Livro nao encontrado!");
            return;
        }
        for (Usuario u : usuarios){
            if(u.livros.contains(l)){
                u.devolverLivro(l);
                l.setEmprestado(false);
                System.out.println("Devolucao por " + u.getNome());
                return;
            }
        }
        
        System.out.println("Livro encontrado!");
    }
    
    public void listasLivrosDisponiveis(){
        System.out.println("_____________Livros Disponiveis_____________");
        for(Livro l : livros){
            if(!l.isEmprestado()){
                System.out.println(l);
            }
        }
    }
}