package ListaLT2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("66666", "Icaro Martins", 10000.0);

        System.out.println("Saldo inicial:");
        conta.mostrarDados();

        System.out.print("\nDigite o valor para depositar: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor para sacar: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println("\nSaldo final:");
        conta.mostrarDados();
    }
}

class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque não permitido: saldo insuficiente.");
        }
    }

    public void mostrarDados() {
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}