
package l.t.pkg2;

public class UsuarioComum extends Usuario {
    
    private final int limite = 3;

    public UsuarioComum(String nome, String id) {
        super(nome, id);
    }
    
    @Override
    public boolean estaAptoparaEmprestimo(){
        return livros.size()<3;
    }
}

