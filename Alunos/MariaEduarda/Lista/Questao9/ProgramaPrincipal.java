package Lista.Questao9;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("Caneta", 2.5);
        Funcionario f = new Funcionario("Maria", 2500);

        p.imprimir();
        f.imprimir();

        Documento d1 = new Relatorio("Relatorio mensal");
        Documento d2 = new Carta("Boas-vindas...");

        d1.abrir();
        d2.abrir();
    }
}

