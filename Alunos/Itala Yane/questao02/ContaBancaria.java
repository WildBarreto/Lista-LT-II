/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

public class ContaBancaria {
    
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double saldo(){
    return saldo;
    }
    
    public double depositar(double valor){
        
        saldo = saldo + valor;
        
    return saldo;
}
    
     public double sacar(double valor){
        
         if(saldo>=valor){
         
         saldo = saldo - valor;
         
         } else {System.out.println("Saldo insuficiente");}
        
        
    return saldo;
}
     
     public void mostrarDados(){
     
     System.out.println(" ---- Dados da conta ----");
     System.out.println("\nTitular: " +titular + "\nNumero Da Conta: " +numero + "\nSaldo: " +saldo);
     
     
     }
   
     
   public static void main(String[] args){
   
    ContaBancaria conta = new ContaBancaria(123000, "maria", 2000.0);
    conta.mostrarDados();
  
    conta.sacar(500);
    System.out.println("\nValor do saldo apos o saque: "+conta.saldo);
    
    conta.depositar(800);
    System.out.println("\nValor do saldo apos o deposito: " +conta.saldo);
   
    
   
   
   
   
   
   }
     
     
     
     }