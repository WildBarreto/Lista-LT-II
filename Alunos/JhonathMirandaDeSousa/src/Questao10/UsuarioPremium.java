package Questao10;

public class UsuarioPremium extends Usuario {
    // Construtor que chama o construtor da superclasse Usuario
    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    // Usuário premium pode sempre emprestar livros, sem limite
    @Override
    public boolean podeEmprestar() {
        return true;
    }
}
