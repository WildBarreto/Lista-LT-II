/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao09;

/**
 *
 * @author curso
 */
public class Produto implements Imprimivel {
    
    String nome; 
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void imprimir (){
    
        System.out.println("produto:" +nome + "\nPreco:" + preco );
    }
}
