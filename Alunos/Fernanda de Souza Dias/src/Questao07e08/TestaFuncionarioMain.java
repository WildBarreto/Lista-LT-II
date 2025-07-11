package Questao07e08;

public class TestaFuncionarioMain {

    public static void main(String[] args) {
        Funcionario g = new Gerente();
        g.nome = "Ana";
        g.salarioBase = 5000;

        Funcionario v = new Vendedor();
        v.nome = "Pedro";
        v.salarioBase = 3000;

        System.out.println(g.nome + ": R$" + g.calcularSalario());
        System.out.println(v.nome + ": R$" + v.calcularSalario());
    }
    
}
