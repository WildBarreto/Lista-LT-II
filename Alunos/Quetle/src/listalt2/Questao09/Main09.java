package listalt2.Questao09;


import listalt2.Questao09.Carta09;
import listalt2.Questao09.Relatorio09;
import listalt2.Questao09.Documento09;
import listalt2.Questao09.Funcionario09;
import listalt2.Questao09.Produto09;
import listalt2.Questao09.Imprimivel09;

public class Main09 {
  public static void main(String[] args){
      
      Imprimivel09 produto = new Produto09("Livro", 15.00);
      Imprimivel09 funcionario = new Funcionario09("Luan", "Vendedor");
      
      produto.imprimir();
      funcionario.imprimir();
      
      Documento09 relatorio = new Relatorio09( "Vendas desse ano", "Vendas...");
      Documento09 carta = new Carta09("Candidato A", "Candidato B", "Contrato");
      
      relatorio.abrir();
      carta.abrir();
  }  
}
