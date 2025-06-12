package AnaHeloisia4info.questao9;

public class Interface {

    interface Imprimivel {
        void imprimir();
    }

    static class Produto implements Imprimivel {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public void imprimir() {
            System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
        }
    }

    static class Funcionario implements Imprimivel {
        private String nome;
        private String cargo;

        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
        }

        @Override
        public void imprimir() {
            System.out.println("Funcionário: " + nome + " | Cargo: " + cargo);
        }
    }

    static abstract class Documento {
        protected String titulo;

        public Documento(String titulo) {
            this.titulo = titulo;
        }

        public abstract void abrir();
    }

    static class Relatorio extends Documento {
        public Relatorio(String titulo) {
            super(titulo);
        }

        @Override
        public void abrir() {
            System.out.println("Abrindo relatório: " + titulo);
        }
    }

    static class Carta extends Documento {
        public Carta(String titulo) {
            super(titulo);
        }

        @Override
        public void abrir() {
            System.out.println("Abrindo carta: " + titulo);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00);
        Funcionario funcionario = new Funcionario("João", "Gerente");

        produto.imprimir();
        funcionario.imprimir();

        Documento relatorio = new Relatorio("Relatório Anual");
        Documento carta = new Carta("Carta de Apresentação");

        relatorio.abrir();
        carta.abrir();
    }
}
