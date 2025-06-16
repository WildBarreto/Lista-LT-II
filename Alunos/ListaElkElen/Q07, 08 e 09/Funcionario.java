/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaunidadei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elkin
 */
public class Funcionario implements Imprimivel {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Funcionário: " + nome + " | CPF: " + cpf + " | Salário Base: R$ " + salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Salário: R$ " + calcularSalario();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        for (int i = 1; i <= qtd; i++) {
            System.out.println("\nFuncionário " + i);
            System.out.print("Tipo (1 - Funcionario, 2 - Gerente, 3 - Vendedor): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Salário base: ");
            double salarioBase = scanner.nextDouble();

            if (tipo == 1) {
                funcionarios.add(new Funcionario(nome, cpf, salarioBase));
            } else if (tipo == 2) {
                System.out.print("Bônus: ");
                double bonus = scanner.nextDouble();
                funcionarios.add(new Gerente(nome, cpf, salarioBase, bonus));
            } else if (tipo == 3) {
                System.out.print("Comissão: ");
                double comissao = scanner.nextDouble();
                funcionarios.add(new Vendedor(nome, cpf, salarioBase, comissao));
            } else {
                System.out.println("Tipo inválido! Funcionário ignorado.");
                i--; // para repetir esse funcionário
            }
            scanner.nextLine(); // limpar buffer
        }

        System.out.println("\nSalários dos Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
