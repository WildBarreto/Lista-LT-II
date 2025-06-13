/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao09;

/**
 *
 * @author analu
 */
public class Principal {
     public static void main(String[] args){
         
        Produto produto = new Produto("Shampoo", 15.50);
        
        Funcionario funcionario = new Funcionario("Joaozinho", "repositor");

        produto.imprimir();
        
        System.out.println("-----------");
        
        funcionario.imprimir();

        System.out.println("-----------");
        
        Documento relatorio = new Relatorio("Relatorio de vendas Junho 2025");
        Documento carta = new Carta("Carta para o gerente do supermercado");

        relatorio.abrir();
        
        System.out.println("-----------");
        
        carta.abrir();
    }
}
