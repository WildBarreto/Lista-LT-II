/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao09;

/**
 *
 * @author analu
 */
public class Produto implements Imprimivel {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Produto: " +nome + "\nPreco: "+preco + "R$");
    }
    
}
