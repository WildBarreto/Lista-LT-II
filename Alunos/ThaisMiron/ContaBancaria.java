package l.t.pkg2;

public class ContaBancaria {
    
    private  int numero;
    private  String titular;
    private  double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor){
        
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$:" + valor + "Realizado com sucesso!!");   
        }else{
            System.out.println("Valor de depósito inválido.");
        }
}

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Não foi possivel realizar o saque!!!");
        }
        
        
    
}
    public void mostrarDados() {
    System.out.println("\nNúmero da Conta: " + numero);
    System.out.println("Titular: " + titular);
    System.out.printf("Saldo: R$%.2f\n", saldo);
}
}
