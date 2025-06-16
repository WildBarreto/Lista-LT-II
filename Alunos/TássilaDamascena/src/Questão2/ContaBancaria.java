
package Questão2;


public class ContaBancaria {
    
    private String numero;
    private String nomeTitular;
    private double saldo;
    
    ContaBancaria (String numero, String nomeTitular, double saldo){
        
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    
    }
    
    void depositar (double valor){
    
    saldo += valor;
    }
    
    void sacar(double valor) {
        saldo -= valor;
    }
    
    void mostrarDados () {
    
    System.out.println("Titular: " + nomeTitular);
    System.out.println("Numero da conta: " + numero);
    System.out.println("Saldo: " + saldo);
    
    }
    
     public double getSaldo() {
        return saldo;
    }
    
    
}
