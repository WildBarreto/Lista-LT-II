package l.t.pkg2;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }
    
    @Override
    public boolean estaAptoparaEmprestimo(){
        return true;
    }
}

