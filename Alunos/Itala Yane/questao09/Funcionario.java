/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao09;

/**
 *
 * @author curso
 */
public class Funcionario implements Imprimivel {
    
    String nome; 
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    public void imprimir() {
        System.out.println("Funcionário:" + nome + "\nCargo:" + cargo);
    }
}
