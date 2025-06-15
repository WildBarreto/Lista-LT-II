package exercicio8;
import exercicio7.Vendedor;
import exercicio7.Gerente;
import exercicio7.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author imidi
 */
public class TestePolimorfismo {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ana", "000.000.000-00", 1800));
        funcionarios.add(new Gerente("Bruno", "111.111.111-11", 3500, 1500));
        funcionarios.add(new Vendedor("Carlos", "222.222.222-22", 2200, 0.05));
        funcionarios.add(new Vendedor("Diana", "333.333.333-33", 3000, 0.20));

        for (Funcionario f : funcionarios) {
            System.out.println(f); 
        }
    }
    
}
