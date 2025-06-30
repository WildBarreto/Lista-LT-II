package questão10;

public class UsuarioComum extends Usuario {

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }


    @Override
    public int getLimiteLivros() {
        return 3; // LIMITE DE 3 LIVROS
    }
}
