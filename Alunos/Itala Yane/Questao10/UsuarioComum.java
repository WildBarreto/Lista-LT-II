/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao10;


    
    public class UsuarioComum extends Usuario{
    public UsuarioComum(String nome, int id) {
        super(nome, id);
    }

    
    @Override
    public boolean podeEmprestar() {
        return livrosEmprestados.size() < 3;
    }
}


