package AnaHeloisia4info.questao7;

import java.util.ArrayList;

public class Questão8 {
    
    public static void main(String[] args) {
        //lista de funcionários (polimórfica)
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //funcionários de tipos diferentes
        funcionarios.add(new Gerente("Ana", "178.856.234-00", 25000, 5000));
        funcionarios.add(new Vendedor("Júlia", "567.123.456-88", 3000, 1500));
        funcionarios.add(new Funcionario("Kaio", "890.056.667-55", 6000));
        funcionarios.add(new Vendedor("Laila", "678.894.234-00", 5500, 4200));
        funcionarios.add(new Gerente("Heicli", "567.123.023-88", 9000, 5400));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("CPF: " + f.cpf);
            System.out.println("Salário calculado: R$ " + f.calcularSalario());
            System.out.println("\n\n");
        }
    }
    
}
