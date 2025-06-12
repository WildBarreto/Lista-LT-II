package questao02;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;


    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void mostrarDados() {
        System.out.println("---------------------------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("---------------------------------------------------");
    }

}
