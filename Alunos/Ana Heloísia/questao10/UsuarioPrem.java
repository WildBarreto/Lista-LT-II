package AnaHeloisia4info.questao10;

public class UsuarioPrem extends Usuario {
    
    public UsuarioPrem(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true;
    }
}
