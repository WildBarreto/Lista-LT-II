package Questão_Sete_Oito_Nove;

public class Carta extends Documento {
    
     public  Carta(String titulo){
      super(titulo);
  }
     @Override
     public void abrir(){
         System.out.println("Titulo da Carta:" + titulo);
     }
    
}
