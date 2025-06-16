package quest002;

public class AppOperacoes {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("1234567890", "Wild Barreto", 1000.0);
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.mostrarDados();
    }
}

