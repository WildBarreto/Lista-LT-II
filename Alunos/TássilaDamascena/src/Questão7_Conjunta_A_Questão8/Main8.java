
package Questão7_Conjunta_A_Questão8;

import java.util.ArrayList;

public class Main8 {
    public static void main (String[]args){
    
    ArrayList<Funcionario> lista = new ArrayList<>();

    lista.add(new Funcionario("Evelyn-Funcionaria", "444.444.444-44", 6000));
    lista.add(new Gerente("Itala-Gerente","555.555.555-55", 4000, 1000));
    lista.add(new Vendedor("Anna Clara-Vendedora","666.666.666-66", 2300, 700));
    lista.add(new Vendedor("Maria Eduarda-Vendedora","777.777.777-77", 3000, 500));
    lista.add(new Funcionario ("Alice-Funcionaria","888.888.888-88", 2300));
    lista.add(new Gerente("Raquel-Gerente","999.999.999-99", 4000, 1000));

        
    for (Funcionario f : lista) {
        System.out.println(f.nome + ": R$ " + f.calcularSalario());
    
    }
    
    
    }
    
}
