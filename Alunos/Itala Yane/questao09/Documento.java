/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao09;

/**
 *
 * @author curso
 */
public abstract class Documento {
    
    protected String titulo; 

    public Documento(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract void abrir();
}
