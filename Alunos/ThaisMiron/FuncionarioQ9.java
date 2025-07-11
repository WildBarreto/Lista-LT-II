package l.t.pkg2;

public class FuncionarioQ9 {
    public class Funcionario implements Imprimivel{
    private String nome;
    private String cargo;
    
    public Funcionario(){
        
    }
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Funcionario: " + getNome() + "\nCargo: " + getCargo());
    }
}
    
    
}
