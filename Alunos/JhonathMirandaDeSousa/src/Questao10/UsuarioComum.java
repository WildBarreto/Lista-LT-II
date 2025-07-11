package Questao10;

public class UsuarioComum extends Usuario {
    // Limite máximo de livros que um usuário comum pode emprestar
    private static final int LIMITE_LIVROS = 3;

    // Construtor que chama o construtor da superclasse Usuario
    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }

    // Verifica se o usuário ainda pode emprestar mais livros (menor que o limite)
    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < LIMITE_LIVROS;
    }
}
