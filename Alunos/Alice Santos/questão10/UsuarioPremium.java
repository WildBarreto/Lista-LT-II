package questão10;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public int getLimiteLivros() {
        return Integer.MAX_VALUE; // SEM LIMITE
    }
}
