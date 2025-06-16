package l.t.pkg2;

import java.util.ArrayList;
import java.util.Scanner;


public class Q8Funcionario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        //adicionei o array na 7º questão também!

    System.out.println("_____________Sistema de Cadastro dos Funcionários_____________");
    System.out.print("Informe a quantidade de funcionarios que deseja cadastrar:");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n--- Cadastro do Funcionário " + (i + 1) + " ---");
            System.out.print("Tipo de funcionário (1 - Gerente | 2 - Vendedor): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome Completo: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Salário base: R$ ");
            double salarioBase = sc.nextDouble();

            if (tipo == 1) {
            System.out.print("Valor do Bônus do Gerente: ");
            double bonus = sc.nextDouble();
            funcionarios.add(new Gerente(bonus, nome, cpf, salarioBase));
            System.out.println("Gerente cadastrado com sucesso!");
            
            } else if (tipo == 2) {
            System.out.print("Valor da Comissão do vendedor: ");
            double comissao = sc.nextDouble();
            funcionarios.add(new Vendedor(comissao, nome, cpf, salarioBase));
            System.out.println("Vendedor cadastrado com sucesso!!");
            } else {
            System.out.println("Tipo inválido!! Por favor, tente novamente.");
            i--; 
            }
            sc.nextLine(); 
            System.out.println();
        }

        System.out.println("\n___________ Funcionários Cadastrados__________");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}
