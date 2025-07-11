package Questao2;

public class ContaBancaria {
    
    private int numero;
    private String titular;
    private double saldo;

    
    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarDados() {
        System.out.println("Numero da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo R$ " + saldo);
        System.out.println("-------------------------");
    }
}

