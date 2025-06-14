package Questao02;

public class TestaContaMain {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numero = "123";
        conta.titular = "Fernanda";
        conta.saldo = 1000;

        conta.mostrarDados();

        conta.depositar(500);
        conta.sacar(200);

        conta.mostrarDados();
    }
    
}
