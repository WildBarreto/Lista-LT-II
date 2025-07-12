package Questao10;

public class UsuarioComum extends Usuario {
    private static final int LIMITE_LIVROS = 3;

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < LIMITE_LIVROS;
    }
}
