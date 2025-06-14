
package Questão9;

import java.util.Scanner;

public class Main9 {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    
        Produto p = new Produto("Notebook", 12.50);
        Funcionario f = new Funcionario("Tassila", 2500.00);

        p.imprimir();
        f.imprimir();
    }
}
