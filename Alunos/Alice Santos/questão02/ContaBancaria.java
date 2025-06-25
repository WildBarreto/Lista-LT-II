package questão02;

public class ContaBancaria {
    private final String numero;
    private final String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("DEPÓSITO DE R$ " + valor + " REALIZADO COM SUCESSO!");
        } else {
            System.out.println("VALOR DE DEPÓSITO INVÁLIDO.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("SAQUE DE R$ " + valor + " REALIZADO COM SUCESSO!");
        } else {
            System.out.println("SAQUE NÃO PERMITIDO. O SALDO É INSUFICIENTE OU O VALOR É INVÁLIDO!");
        }
    }

    public void mostrarDados() {
        System.out.println("NÚMERO DA CONTA: " + numero);
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO ATUAL: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}