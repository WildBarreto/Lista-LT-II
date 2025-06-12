package AnaHeloisia4info.questao2;

public class ContaBancaria {
   
     double numero;
     double saldo;
     String titular;
     double valor;

    public ContaBancaria(double numero, double saldo, String titular, double valor) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.valor = valor;
    }
       
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
       
    void depositar(){
        System.out.println(valor+" Foi o valor depositado");
      
    }
    
    void saldoinicial(){
        System.out.println("\nSaldo atual: " +saldo);
        
    }
    
    void saldofinal(){
        double valorfinal;
        valorfinal = saldo+valor;
        System.out.println("\nSaldo após deposito: " +valorfinal);
        
    }
    
    void saque(){
        if(valor > saldo){
            System.out.println("Você não possui esse valor em conta.");
            }else{
        System.out.println(valor+" Foi o valor sacado");
        System.out.println("\nSaldo após saque: "+(saldo-valor));
    }
    }
       
}
