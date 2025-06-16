/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author analu
 */
public class Retangulo {
    double largura;
    double altura;
    
    public Retangulo(double largura, double altura){
    this.largura = largura;
    this.altura = altura;
    }
    
   public double AreaRetangulo(){
    return altura * largura;
   }
   
   public double PerimetroRetangulo(){
       return 2 *(altura * largura);
   }
}


