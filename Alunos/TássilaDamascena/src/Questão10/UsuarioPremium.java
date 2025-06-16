
package Questão10;


public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true;
    }
}

