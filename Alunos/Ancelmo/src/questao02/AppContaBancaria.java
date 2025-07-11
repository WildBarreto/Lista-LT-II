package questao02;

public class AppContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("8921983-5", "Wild Barreto", 0.0);

        conta.mostrarDados();
        System.out.println();

        double deposito1 = 950.0;
        double saque1 = 400.0;
        double deposito2 = 100.0;
        double saque2 = 1000.0;

        
        deposito(conta, deposito1);
        saque(conta, saque1);

        conta.mostrarDados();

        deposito(conta, deposito2);
        saque(conta, saque2);

        conta.mostrarDados();
    }

    private static void deposito(ContaBancaria conta, double valor) {
        conta.depositar(valor);

        System.out.println("---------------------------------------------------");
        System.out.println(conta.getTitular() + ": Depósito de R$ " + valor + " feito com sucesso!");
        System.out.println("---------------------------------------------------");
    }

    private static void saque(ContaBancaria conta, double valor) {
        System.out.println("---------------------------------------------------");
        if (conta.sacar(valor)) {
            System.out.println(conta.getTitular() + ": Saque de R$ " + valor + " feito com sucesso!");
        } else {
            System.out.println(conta.getTitular() + ": Saldo insuficiente!");
        }
        System.out.println("---------------------------------------------------");
    }
}
