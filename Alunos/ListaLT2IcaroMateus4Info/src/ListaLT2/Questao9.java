package ListaLT2;

interface Imprimivel {
    void imprimir();
}

abstract class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void abrir();
}

class Relatorio extends Documento {
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo relatorio: " + titulo);
    }
}

class Carta extends Documento {
    public Carta(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo carta: " + titulo);
    }
}

class Produto implements Imprimivel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("Produto: " + nome + " - Preco: R$ " + preco);
    }
}

class FuncionarioImp extends Funcionario implements Imprimivel {
    public FuncionarioImp(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + nome + " - CPF: " + cpf + " - Salario: R$ " + calcularSalario());
    }
}

public class Questao9 {
    public static void main(String[] args) {
        Documento d1 = new Relatorio("Relatorio Financeiro");
        Documento d2 = new Carta("Carta de Demissao");

        d1.abrir();
        d2.abrir();

        Imprimivel p = new Produto("Notebook", 3200.0);
        Imprimivel f = new FuncionarioImp("Icaro", "123.456.789-00", 4000);

        p.imprimir();
        f.imprimir();
    }
}