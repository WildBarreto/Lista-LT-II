package listalt2.Questao09;


import listalt2.Questao09.Imprimivel09;

public class Funcionario09 implements Imprimivel09 {
    private String nome;
    private String cargo;

    public Funcionario09(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    @Override
    public void imprimir() {
      System.out.println("Funcionário: " + nome + ", Cargo: " + cargo);
    }  
}
