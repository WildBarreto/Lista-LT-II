package listalt2.Questao10;

import listalt2.Questao10.Usuario10;
import listalt2.Questao10.Livro10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca10 {
    private Map<String, Livro10> livros;
    private Map<Integer, Usuario10> usuarios;

    public Biblioteca10() {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }
    
    public void adicionarLivro(Livro10 livro){
      livros.put(livro.getIsbn(), livro);
    }
    
    public void adicionarUsuario(Usuario10 usuario){
        usuarios.put(usuario.getId(), usuario);
    }
    
    public boolean EmprestarLivro(String isbn, int usuarioId){
        Livro10 livro = livros.get(isbn);
        Usuario10 usuario = usuarios.get(usuarioId);
        
        if(livro == null || usuario == null){
            return false;
        }
        if(livro.isEmprestado()|| !usuario.podePegarLivro()){
            return false;
        }
        
        livro.setEmprestado(true);
        usuario.incrementarLivroEmp();
        return true;
    }
    
    public boolean devolverLivro(String isbn){
        Livro10 livro = livros.get(isbn);
        
        if(livro == null || !livro.isEmprestado()){
            return false;
        }
        
        livro.setEmprestado(false);
        
        for(Usuario10 usuario : usuarios.values()){
            if(usuario.getLivroEmp()>0 ){
                usuario.decrementarLivroEmp();
                break;
            }
        }
        return true;   
    }
    
    public List<Livro10> listarLivrosDisponiveis(){
        List<Livro10> disponiveis = new ArrayList<>();
        for(Livro10 livro : livros.values()){
            if(!livro.isEmprestado()){
                disponiveis.add(livro);
            }  
        }
        return disponiveis;
    }
    
    public void listarStatus(){
     System.out.println("\n *** Biblioteca *** ");
     System.out.println("Livros: ");
     livros.values().forEach(System.out::println);
     
     System.out.println("\n *** Usuário *** ");
     usuarios.values().forEach(System.out::println);
    }
}
