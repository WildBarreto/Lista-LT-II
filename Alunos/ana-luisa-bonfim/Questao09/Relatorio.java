/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao09;

/**
 *
 * @author analu
 */
public class Relatorio extends Documento {
        
    public Relatorio(String titulo){
        super(titulo);
}
    
    @Override
    public void abrir(){
        System.out.println("Relatorio: " +titulo);
}

}
