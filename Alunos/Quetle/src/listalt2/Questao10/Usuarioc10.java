package listalt2.Questao10;


import listalt2.Questao10.Usuario10;

public class Usuarioc10 extends Usuario10 {
    private static final int LIMITE = 3;
    
    public Usuarioc10(String nome, int id){
        super(nome, id);
    }
    
    @Override
    public boolean podePegarLivro(){
        return getLivroEmp() < LIMITE;
    }
}
