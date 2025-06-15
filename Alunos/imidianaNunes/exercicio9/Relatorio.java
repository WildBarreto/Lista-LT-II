/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

import exercicio9.Documento;

/**
 *
 * @author imidi
 */
public class Relatorio extends Documento {
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo relatorio: " + titulo);
    }
    
}
