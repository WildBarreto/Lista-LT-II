package Lista.Questoes7e8;
import java.util.ArrayList;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Duda", 2000));
        funcionarios.add(new Gerente("Luciano", 4000, 1500));
        funcionarios.add(new Vendedor("Wild", 1800, 800));

        for (Funcionario f : funcionarios) {
            f.calcularSalario();
        }
    }
}

