package questão08;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- CADASTRO DE FUNCIONÁRIOS --- ");
        System.out.print("\nQUANTOS FUNCIONÁRIOS DESEJA CADASTRAR? ");
        int total = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.println("\n==============================");
            System.out.println("FUNCIONÁRIO " + (i + 1));
            System.out.println("==============================\n");

            System.out.print("DIGITE 1 PARA GERENTE OU 2 PARA VENDEDOR: ");
            int tipo = sc.nextInt();
            sc.nextLine(); // limpa \n

            System.out.print("NOME: ");
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("SALÁRIO BASE: R$ ");
            double salarioBase = sc.nextDouble();

            if (tipo == 1) {
                System.out.print("BÔNUS DO GERENTE: R$ ");
                double bonus = sc.nextDouble();
                lista.add(new Gerente(nome, cpf, salarioBase, bonus));
            } else if (tipo == 2) {
                System.out.print("COMISSÃO DO VENDEDOR: R$ ");
                double comissao = sc.nextDouble();
                lista.add(new Vendedor(nome, cpf, salarioBase, comissao));
            } else {
                System.out.println("TIPO INVÁLIDO. PULANDO ESTE FUNCIONÁRIO.");
            }

            sc.nextLine();
        }
        
        System.out.println("\n --- LISTA DE FUNCIONÁRIOS E SALÁRIOS --- ");
        for (Funcionario f : lista) {
            System.out.println(f);
        }

        sc.close();
    }
}