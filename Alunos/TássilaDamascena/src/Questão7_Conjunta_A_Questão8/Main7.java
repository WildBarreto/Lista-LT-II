
package Questão7_Conjunta_A_Questão8;


public class Main7 {
    public static void main(String[] args){
   
    Funcionario[] funcionarios = new Funcionario[3];
    
    funcionarios[0] = new Funcionario("Tassila_Funcionaria", "111.111.111-11", 2000);
    funcionarios[1] = new Gerente("Ana Luisa_Gerente", "222.222.222-22", 4000, 1000);
    funcionarios[2] = new Vendedor("Thais_Vendedor", "333.333.333-33", 2500, 500);

    for (Funcionario f : funcionarios) {
         f.exibirSalario();
    }
 
   } 
}
