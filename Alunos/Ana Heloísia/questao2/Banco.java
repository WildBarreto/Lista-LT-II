package AnaHeloisia4info.questao2;

public class Banco{
    
    double numero;
    String titular;
    double saldo;

    public Banco(double numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
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
     
    public void depositar (double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.println("\nDepósito de R$" + valor + " realizado com sucesso.\n");
        } else {
            System.out.println("\nDepósito de inválido.\n");
        }
    }
    
    public void sacar (double valor){
        if (valor > 0) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("\nSaque de R$" + valor + " realizado com sucesso.\n");
            } else {
                System.out.println("\nSaldo insuficiente para saque.\n");
            }
        } else {
            System.out.println("\nValor de saque invalido.\n");
        }
    }
    
    public void mostrarDados (){
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}