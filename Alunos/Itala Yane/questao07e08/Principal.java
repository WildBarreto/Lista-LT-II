/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao07e08;

import java.util.ArrayList;

/**
 *
 * @author curso
 */
public class Principal {
    
     public static void main(String[] args){
         
          ArrayList<Funcionario> funcionarios = new ArrayList<>();
          
    funcionarios.add(new Vendedor("Ana Luisa", "224567876-54", 4000, 2000 ));
    funcionarios.add(new Gerente("Luciano", "334654666-78", 10000, 3000));
    funcionarios.add(new Funcionario("Itala", "456678988-00", 3000 ));
    
   
    System.out.println(" ---- Lista de funcionarios ---- ");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
}
    
} 
}