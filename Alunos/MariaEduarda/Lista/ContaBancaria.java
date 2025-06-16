package Lista;
import java.util.Scanner;

public class ContaBancaria {
    
    int numero;
    String titular;
    double saldo;
    
    public ContaBancaria(){
        
    }
    
    public void depositar(double valor){
        
        saldo += valor;
        System.out.print("O saldo atual é: "+ saldo +"\n");
        
    }
    
    public void sacar(double valor){
        
        if(valor > saldo){           
            System.out.print("\nSaldo insuficiente\n");
               
        }else          
           saldo -= valor;
           System.out.print("O saldo atual é: "+ saldo+"\n");
         
    }

    
    public void mostrarDados(){
        
        System.out.print("\n\n**Dados do usuario**");
        System.out.print("\nNumero da conta: "+numero+"\nTitular: "+titular+"\nSaldo: "+saldo+"\n");
    
    }
    
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        double valor;
        
        ContaBancaria c1 = new ContaBancaria();
        System.out.print("Numero da conta: ");
        c1.numero = scanner.nextInt();
        
        System.out.print("Nome do titular: ");
        c1.titular = scanner.next();
        
        System.out.print("Saldo: ");
        c1.saldo = scanner.nextDouble();
        
        System.out.print("\nDigite um valor para deposito: ");
        valor = scanner.nextDouble();
        c1.depositar(valor);
        
        System.out.print("\nDigite um valor para saque: ");
        valor = scanner.nextDouble();
        c1.sacar(valor);  
        
        c1.mostrarDados();
    }
    
    
}
