interface Imprimivel {
    void imprimir();
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
        System.out.println("Produto: " + nome + " | Preco: R$" + preco);
    }
}

abstract class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void abrir();
}

class Relatorio extends Documento {
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        super(titulo);
        this.conteudo = conteudo;
    }

    @Override
    public void abrir() {
        System.out.println("Relatorio: " + titulo);
        System.out.println("Conteudo: " + conteudo);
    }
}

class Carta extends Documento {
    private String destinatario;

    public Carta(String titulo, String destinatario) {
        super(titulo);
        this.destinatario = destinatario;
    }

    @Override
    public void abrir() {
        System.out.println("Carta para: " + destinatario);
        System.out.println("Assunto: " + titulo);
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel[] imprimiveis = {
            new Produto("Notebook", 3500.00),
            new Funcionario("Joao", "111.111.111-11", 3000)
        };

        Documento[] documentos = {
            new Relatorio("Vendas Trimestrais", "Vendas aumentaram 20%"),
            new Carta("Proposta Comercial", "Empresa ABC")
        };

        System.out.println("Imprimindo objetos:");
        for (Imprimivel obj : imprimiveis) {
            obj.imprimir();
        }

        System.out.println("\nAbrindo documentos:");
        for (Documento doc : documentos) {
            doc.abrir();
        }
    }
}

class Funcionario implements Imprimivel {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + nome + " | CPF: " + cpf + " | Salario: R$" + salario);
    }
}