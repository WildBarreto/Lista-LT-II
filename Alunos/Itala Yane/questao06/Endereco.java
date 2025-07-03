/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao06;

/**
 *
 * @author curso
 */
public class Endereco {
    
    String rua;
    int numero;
    String cidade;
    String cep;

    public Endereco(String rua, int numero, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return  "\nrua: " + rua + "\nnumero: " + numero + "\ncidade: " + cidade + "\ncep: " + cep +"";
    }
    
    
    
}
