import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("Joao Silva", "111.111.111-11", 3000));
        funcionarios.add(new Gerente("Maria Souza", "222.222.222-22", 5000, 1500));
        funcionarios.add(new Vendedor("Carlos Oliveira", "333.333.333-33", 2500, 800));
        funcionarios.add(new Vendedor("Ana Costa", "444.444.444-44", 2500, 1200));
        funcionarios.add(new Gerente("Pedro Santos", "555.555.555-55", 6000, 2000));
        funcionarios.add(new Funcionario("Lucia Ferreira", "666.666.666-66", 3500));

        System.out.println("Calculo polimorfico de salarios:");
        for (Funcionario func : funcionarios) {
            double salario = func.calcularSalario();
            System.out.printf("%s - Salario calculado: R$%.2f%n", func.getNome(), salario);
        }
    }
}

class Funcionario {
    private String nome;
    private String cpf;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
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
