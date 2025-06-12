package AnaHeloisia4info.questao7;

public class Main {
       
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Ana", "178.856.234-00", 15000, 3000);
        Vendedor vendedor = new Vendedor("Júlia", "567.123.456-88", 3000, 1500);
        Funcionario funcionario = new Funcionario("Kaio", "890.056.667-55", 2500);

        //salários calculados
        System.out.println("Funcionário: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.calcularSalario());

        System.out.println("\n\nFuncionário: " + vendedor.nome);
        System.out.println("Salário: R$ " + vendedor.calcularSalario());

        System.out.println("\n\nFuncionário: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.calcularSalario());
        
    }
}