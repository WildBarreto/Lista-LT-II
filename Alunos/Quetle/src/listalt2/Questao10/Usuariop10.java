package listalt2.Questao10;


import listalt2.Questao10.Usuario10;

public class Usuariop10 extends Usuario10{ 
    public Usuariop10(String nome, int id) {
        super(nome, id);
    }
    @Override
    public boolean podePegarLivro(){
        return true;
    }
}
