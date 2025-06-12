package questao10;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;


    public Biblioteca(ArrayList<Livro> livros, ArrayList<Usuario> usuarios) {
        this.livros = livros;
        this.usuarios = usuarios;
    }

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public boolean emprestarLivro(String isbn, long usuarioId) {  // Empresta um livro
        // 1° Verificar se o livro e o usuario existem
        // 2° Verificar se o livro está não está emprestado
        // 3° Verificar se o usuário é do tipo "Comum"  e se não atingiu o limite de empréstimos de livros
        // 4° Realizar o empréstimo
        Livro livro = livroExistePeloIsbn(isbn);           // Capturando o Livro pelo isbn
        Usuario usuario = usuarioExistePeloId(usuarioId);  // Capturando o Usuário pelo id

        if (livro == null || usuario == null) return false;                                                       // 1° Verificação
        if (livro.isEmprestado()) return false;                                                                   // 2° Verificação
        if (isUsuarioComum(usuario) && ((UsuarioComum) usuario).getLivrosEmprestados().size() == 3) return false; // 3° Verificação

        usuario.getLivrosEmprestados().add(livro);         // Adicionando livro à lista de emprestados do usuário 
        livro.setEmprestado(true);              // Alterando status do livro para "emprestado"

        return true;
    }

    public boolean devolverLivro(String isbn) {  // Devolve o livro pelo ISBN
        if (livros.isEmpty() || usuarios.isEmpty()) return false;  // Verificando se 

        Livro livro = livroExistePeloIsbn(isbn);               // Capturando o Livro pelo isbn         
        Usuario usuario = usuarioPeloLivroEmprestado(livro);   // Capturando o usuário que pegou o livro emprestado
        
        if (livro == null) return false;

        int indexRemove = usuario.getLivrosEmprestados().indexOf(livro);  // Captura o id do livro na lista de livros pegos por empréstimo do usuário
        usuario.getLivrosEmprestados().remove(indexRemove);               // Tirando livro da lista de emprestados do usuário
        livro.setEmprestado(false);                            // Alterando status de "esprestado" do livro
        
        return true;
    }

    public void listarLivrosDisponiveis() {  // Lista livro cadastrados
        StringBuilder list = new StringBuilder();
        
        list.append("--------------------------------------------------\n");

        if (livros.isEmpty()) {
            list.append("          NENHUM LIVRO CADASTRADO\n");
            list.append("--------------------------------------------------\n");
        } else {
            list.append("--------------------------------------------------\n");
            list.append("             LIVROS CADASTRADOS\n");
            list.append("--------------------------------------------------\n");
        }

        for(Livro l : livros) {
            list.append("--------------------------------------------------\n");
            list.append("Titulo: " + l.getTitulo() + "\n");
            list.append("Autor: " + l.getAutor() + "\n");
            list.append("ISBN: " + l.getIsbn() + "\n");
            list.append("Status: " + (l.isEmprestado() ? "Esprestado" : "Livre") + "\n");
            list.append("--------------------------------------------------\n");
        }

        list.append("--------------------------------------------------\n");

        System.out.println(list.toString());

    }

    private boolean isUsuarioComum(Usuario u) { // Verifica se o usuário especificado é do tipo "Comum"
        if (u instanceof UsuarioComum) return true;
        return false;
    }

    private Livro livroExistePeloIsbn(String isbn) {  // Captura o livro pelo ISBN
        Livro livro = null;

        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                livro = l;
                break;
            } 
        }

        return livro;
    }

    private Usuario usuarioExistePeloId(long id) {  // Captura o usuário pelo id
        Usuario usuario = null;

        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                usuario = u;
                break;
            }
        }

        return usuario;
    }

    private Usuario usuarioPeloLivroEmprestado(Livro livro) {  // Captura o usuário que pegou o livro especificado por empréstimo
        Usuario usuario = null;

        for (Usuario u : usuarios) {
            for (Livro l : u.getLivrosEmprestados()) {
                if (l == livro) {
                    usuario = u;
                    return usuario;
                }
            }
        }

        return usuario;
    }

}
