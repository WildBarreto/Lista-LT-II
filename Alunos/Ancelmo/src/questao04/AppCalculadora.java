package questao04;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("Primeiro Teste:");
        System.out.println("9 + 10 = " + c.somar(9, 10));

        System.out.println("Segundo Teste:");
        System.out.println("3,5 + 7,2 = " + c.somar(3.5, 7.2));

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Terceiro Teste:");
        System.out.println("1 + 2 + 3 + 4 + 5 = " + c.somar(nums));
    }

}
