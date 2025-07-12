package Questão_Dois;


public class ContaBancaria {
   int numero;
   String titular;
  public float saldo;
   
   
   public ContaBancaria(int numero, String titular, float saldo){
       
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
    }
   
 public  void Depositar(float valor){
    saldo += valor;
   }
 public  void Sacar(float valor){
       if(saldo >= valor){
          saldo -= valor; 
       } else 
           System.out.println("Saldo insuficiente");
       }
 public void MostrarDados(){
    System.out.println("Numero: " + numero + " Titular: " + titular + " Saldo: " + saldo);
   
    }
  }

