package Questao02;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void mostrarDados() {
        System.out.println("Conta: " + numero + ", Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
