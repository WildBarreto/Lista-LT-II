package Questão_Sete_Oito_Nove;

public class Relatorio extends Documento {
    
  public  Relatorio(String titulo){
      super(titulo);
  }
    
@Override
public void abrir(){
   System.out.println("Titulo do Relatório:" + titulo);
    
}
            
}
