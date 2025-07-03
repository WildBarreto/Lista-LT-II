/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;


public class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nome, int id) {
        super(nome, id);
    }

    @Override
    public boolean podeEmprestar() {
        return true; 
    }
}