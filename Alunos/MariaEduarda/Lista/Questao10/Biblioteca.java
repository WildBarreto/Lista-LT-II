package Lista.Questao10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {
    
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, int usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null || usuario == null) {
            JOptionPane.showMessageDialog(null, "Livro ou usuário não encontrado.");
            
        } else if (livro.emprestado) {
            JOptionPane.showMessageDialog(null, "Livro já emprestado.");
            
        } else if (usuario.podeEmprestar() == false) {
            JOptionPane.showMessageDialog(null, "Usuário atingiu o limite de empréstimos.");
            
        } else {
            livro.emprestado = true;
            usuario.emprestarLivro(livro);
            JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
        }
    }

    public void devolverLivro(String isbn) {
        
        Livro livro = buscarLivro(isbn);
        
        if (livro != null && livro.emprestado) {
            
            for (Usuario u : usuarios) {
                
                if (u.livrosEmprestados.contains(livro)) {
                    u.devolverLivro(livro);
                    livro.emprestado = false;
                    JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Livro não está emprestado ou não encontrado.");
        }
    }

    public void listarLivrosDisponiveis() {
        
        String texto = "Livros disponíveis:\n";
        for (Livro l : livros) {
            if (l.emprestado == false) {
                texto += l.info() + "\n";
        }
    }
        if (texto.equals("Livros disponíveis:\n")) {
            texto = "Nenhum livro disponível.";
    }
        JOptionPane.showMessageDialog(null, texto);
}


    private Livro buscarLivro(String isbn) {
        
        for (Livro l : livros) {
            if (l.isbn.equals(isbn)) return l;
        }
        return null;
    }

    private Usuario buscarUsuario(int id) {
        
        for (Usuario u : usuarios) {
            if (u.id == id) return u;
        }
        return null;
    }

    public void mostrarLivrosUsuarios() {
        
        String texto = "";
        for (Usuario u : usuarios) {
            texto += u.listarLivros() + "\n";
    }
    
        JOptionPane.showMessageDialog(null, texto);
}

}
