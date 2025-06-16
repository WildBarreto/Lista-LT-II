package l.t.pkg2;

import java.util.Scanner;

public class PrincipalQ9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Informe o valor: ");
        double valor = sc.nextDouble();
        
        sc.nextLine();
        Produto p = new Produto(nome, valor);
        
        System.out.println("____________PRODUTO REGISTRADO COM SUCESSO____________\n");
        
        System.out.println("Informe o nome do funcionario: ");
        nome = sc.nextLine();
        System.out.println("Qual o cargo? ");
        String cargo = sc.nextLine();
        
        Funcionario f = new Funcionario(nome, cargo);
        System.out.println("______________Funcionario Cadastrado_____________\n");
        
        System.out.println("Defina o titulo do relatorio: ");
        String titulo = sc.nextLine();
        Relatorio r = new Relatorio(titulo);
        
        System.out.println("_____________Relatorio Criado______________\n");
        
        System.out.println("Defina o titulo da carta: ");
        titulo = sc.nextLine();
        Carta c = new Carta(titulo);
        
        System.out.println("_____________Carta Preparada______________\n");
        
        System.out.println("_____________EXIBIR INFORMAÇÕES______________\n");
        
        System.out.println("___________________________\n");
        p.imprimir();
        System.out.println("___________________________\n");
        f.imprimir();
        System.out.println("___________________________\n");
        r.abrir();
        System.out.println("___________________________\n");
        c.abrir();
    }
}