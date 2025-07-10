/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao09;

/**
 *
 * @author curso
 */
public class Principal {
    
    
     public static void main(String[] args){
         
         Produto produto = new Produto("Computador" , 7.000);
         Funcionario funcionario = new Funcionario("Fabio", "Desenvolvedor de Softwares");
         
         System.out.println("-----------------------------------\n");
         
         produto.imprimir();
         funcionario.imprimir();
         
         System.out.println("-------------------------------------\n");
         
         Documento relatorio = new Relatorio("Relatorio aberto");
         Documento carta = new Carta("Carta aberta");
         
    
         relatorio.abrir();
         carta.abrir();
         
     }
}
