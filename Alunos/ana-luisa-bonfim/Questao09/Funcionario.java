/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao09;

/**
 *
 * @author analu
 */
public class Funcionario implements Imprimivel{
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Fucionario: " +nome + "\nCargo: " +cargo);
    }
}
