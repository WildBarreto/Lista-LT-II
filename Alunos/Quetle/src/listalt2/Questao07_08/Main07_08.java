package listalt2.Questao07_08;

import listalt2.Questao07_08.Gerente07;
import listalt2.Questao07_08.Funcionario07;
import java.util.ArrayList;
import java.util.List;
import listalt2.Questao07_08.Funcionario07;
import listalt2.Questao07_08.Gerente07;
import listalt2.Questao07_08.Vendedor07;

public class Main07_08 {
    public static void main(String[]args){
        
        System.out.println("--- SALÁRIOS ---");
        System.out.println("1. Funcionario: Salário Base.");
        System.out.println("2. Gerente: Salário Base + Bônus.");
        System.out.println("3. Vendedor: Salário Base + Comissão.");
        
        List<Funcionario07> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario07("\n Lucas", "1234567910",1500));
        funcionarios.add(new Gerente07(" Maria Antônia","456789311",1500.00, 3000.00));
        funcionarios.add(new Gerente07(" Victor Gabriel","55221788900",1500.00, 3000.00));
        funcionarios.add(new Vendedor07(" João Pedro","12367490289",1500.00, 50.00));
        funcionarios.add(new Vendedor07(" Clara Isabelly","1245672233",1500.00, 50.00));
       
        for( Funcionario07 f : funcionarios){
            System.out.println( f.nome + " (CPF:" +f.cpf+ ") - Salário: R$ " +f.calcularSalario());
        }
        
        System.out.println("\n --- Cálculo de Salários ---"); 
        for(Funcionario07 func : funcionarios){
            double salario = func.calcularSalario();
            System.out.printf("%s (CPF: %s ) - Cargo: %s - Salário Total: %.2f%n", func.nome, func.cpf, func.getClass().getSimpleName(), salario);  
        }   
    }
}
