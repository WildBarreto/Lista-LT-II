package Exercicio10;

/**
 *
 * @author Fernanda Santos
 */
public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        
        return true;
    }
}
