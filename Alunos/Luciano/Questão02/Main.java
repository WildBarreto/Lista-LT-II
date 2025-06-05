package Questão02;

public class Main {
    public static void main(String[] args) {
    
        ContaBancaria conta = new ContaBancaria("12345", "Luciano", 40000.00);

        System.out.println("Dados iniciais da conta");
        conta.mostrarDados();

        System.out.println("\nRealizando depósito de R$ 500");
        conta.depositar(500);
        conta.mostrarDados();

        System.out.println("\nRealizando saque de R$ 300 ");
        conta.sacar(300);
        conta.mostrarDados();
    
        System.out.println("\nTentando sacar R$ 1500");
        conta.sacar(1500);
        conta.mostrarDados();
    }
}

