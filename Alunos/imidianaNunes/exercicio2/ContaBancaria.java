package exercicio2;

/**
 *
 * @author imidi
 */
public class ContaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

    public void mostrarDados() {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
    
}
