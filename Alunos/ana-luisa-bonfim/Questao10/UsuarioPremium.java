/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;

/**
 *
 * @author analu
 */
public class UsuarioPremium extends Usuario{
    public UsuarioPremium(String nome, String id) {
        super(nome, id);
    }

    @Override
    public boolean permitir() {
        return true;
    }
}
