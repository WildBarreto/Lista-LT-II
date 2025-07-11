package Lista.Questao10;

public class UsuarioComum extends Usuario {
    
    public UsuarioComum(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}

