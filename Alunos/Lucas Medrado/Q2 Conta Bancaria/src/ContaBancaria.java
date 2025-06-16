public class ContaBancaria {
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

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", "Joao Silva", 1000.0);
        
        System.out.println("=== CONTA BANCARIA ===");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Conta: " + conta.numero);
        
        System.out.println("\nSaldo inicial:");
        conta.mostrarSaldo();
        
        System.out.println("\n>>> OPERACAO DE DEPOSITO <<<");
        System.out.println("Saldo antes do deposito:");
        conta.mostrarSaldo();
        
        double valorDeposito = 500.0;
        System.out.println("Depositando: " + valorDeposito);
        conta.depositar(valorDeposito);
        
        System.out.println("Saldo apos deposito:");
        conta.mostrarSaldo();
        
        System.out.println("\n>>> OPERACAO DE SAQUE <<<");
        System.out.println("Saldo antes do saque:");
        conta.mostrarSaldo();
        
        double valorSaque = 200.0;
        System.out.println("Sacando: " + valorSaque);
        boolean saqueRealizado = conta.sacar(valorSaque);
        
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
        
        System.out.println("Saldo apos saque:");
        conta.mostrarSaldo();
        
        System.out.println("\n>>> TENTATIVA DE SAQUE COM VALOR EXCEDENTE <<<");
        System.out.println("Saldo atual:");
        conta.mostrarSaldo();
        
        double valorSaqueExcedente = 2000.0;
        System.out.println("Tentando sacar: " + valorSaqueExcedente);
        saqueRealizado = conta.sacar(valorSaqueExcedente);
        
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Falha no saque: Saldo insuficiente!");
        }
        
        System.out.println("Saldo apos tentativa de saque:");
        conta.mostrarSaldo();
    }
}