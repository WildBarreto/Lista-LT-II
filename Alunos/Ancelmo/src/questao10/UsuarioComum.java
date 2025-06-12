package questao10;

import java.util.ArrayList;

public class UsuarioComum extends Usuario {

    public UsuarioComum(String nome) {
        super(nome);
        livrosEmprestados = new ArrayList<Livro>(3);
    }

}
