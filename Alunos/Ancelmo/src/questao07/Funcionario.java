package questao07;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;


    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {return salarioBase;}

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Nome: " + nome + "\n");
        s.append("Cargo: " + this.getClass().getSimpleName() + "\n");
        s.append("CPF: " + cpf + "\n");
        s.append("Salario Base: R$ " + salarioBase + "\n");
        
        return s.toString();
    }
    
}
