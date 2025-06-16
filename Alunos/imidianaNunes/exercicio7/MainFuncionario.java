package exercicio7;
import exercicio7.Vendedor;
import exercicio7.Gerente;
import exercicio7.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author imidi
 */
public class MainFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Joao", "111.111.111-11", 2000));
        funcionarios.add(new Gerente("Maria", "222.222.222-22", 3000, 1000)); 
        funcionarios.add(new Vendedor("Pedro", "333.333.333-33", 2500, 0.10));

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
    
}
