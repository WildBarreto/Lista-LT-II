
package Questão9;

public class Main9 {
    
    public static void main(String[] args) {
    
    Produto p = new Produto("Notebook", 2.047);
    Funcionario f = new Funcionario("Tassila", 2500.00);

        p.imprimir();
        f.imprimir();
        
        Documento doc1 = new Relatorio("Relatorio...");
        Documento doc2 = new Carta("Carta...");

        doc1.abrir();
        doc2.abrir();
        
    }
}
