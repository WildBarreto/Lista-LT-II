/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author curso
 */
public class Test {
    
    
    
    public static void main (String[] args){
            
       Set<Contato> novocont = new HashSet<>();
       
       
       Contato c1 = new Contato("Analu", "analu@gmail.com","7599-0006" );
       Contato c2 = new Contato("Tassila", "tassiladamascena@gmail.com","7598-0786" );
       Contato c3 = new Contato("Evelyn", "analu@gmail.com","7409-3126" );
 
      novocont.add(c1);
      novocont.add(c2);
      novocont.add(c3);
      
      
      for(Contato c : novocont){
          
          System.out.println(c);
      }
    
    }
    
}
