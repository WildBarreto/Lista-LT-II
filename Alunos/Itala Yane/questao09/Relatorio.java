/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao09;

/**
 *
 * @author curso
 */
public class Relatorio extends Documento {
    
    public Relatorio(String titulo){
    
        super(titulo);
    }

public void abrir(){

    System.out.println("O relatorio esta sendo aberto: " +titulo);
}

}
