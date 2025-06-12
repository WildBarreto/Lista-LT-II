package ListaLT2;

public class Questao7 {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Wild", "111.111.111-11", 8000, 1000);
        Funcionario f2 = new Vendedor("Icaro", "222.222.222-22", 0, 100);

        System.out.println(f1.nome + " - Salario: " + f1.calcularSalario());
        System.out.println(f2.nome + " - Salario: " + f2.calcularSalario());
    }
}

class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}