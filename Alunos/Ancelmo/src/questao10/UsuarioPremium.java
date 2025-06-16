package questao10;

import java.util.ArrayList;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome) {
        super(nome);
        livrosEmprestados = new ArrayList<Livro>();
    }

}
