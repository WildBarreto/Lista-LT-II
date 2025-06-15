package ProjetoBiblioteca;

/**
 *
 * @author imidi
 */
public class UsuarioComum extends Usuario{
    private static final int LIMITE = 3;

    public UsuarioComum(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < LIMITE;
    }
    
}
