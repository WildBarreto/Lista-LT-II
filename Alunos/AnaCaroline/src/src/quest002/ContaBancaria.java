package quest002;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public void mostrarDados() {
        System.out.println("Numero: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}