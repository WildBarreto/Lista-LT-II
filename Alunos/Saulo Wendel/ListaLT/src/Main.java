import Questão_Sete_Oito_Nove.*;
import Questão_Seis.*;
import Questão_Cinco.*;
import Questão_Quatro.*;
import Questão_Três.*;
import Questão_Dois.*;
import Questão_Um.*;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Menu de Tarefas ===");
            System.out.println("1. Tarefa 1 - Retângulos");
            System.out.println("2. Tarefa 2 - Conta Bancária");
            System.out.println("3. Tarefa 3 - Aluno");
            System.out.println("4. Tarefa 4 - Calculadora");
            System.out.println("5. Tarefa 5 - Contato");
            System.out.println("6. Tarefa 6 - Pessoa/Endereço");
            System.out.println("7. Tarefa 7 - Funcionário e tarefa 8 - Funcionário com ArrayList ");
            System.out.println("9. Tarefa 9 - Imprimivel/Documento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os valores para o primeiro retângulo:");
                    System.out.print("Largura: ");
                    float largura1 = scanner.nextFloat();
                    System.out.print("Altura: ");
                    float altura1 = scanner.nextFloat();
                    Retangulos retangulo1 = new Retangulos(largura1, altura1);
                            
                    System.out.println("Digite os valores para o segundo retângulo:");
                    System.out.print("Largura: ");
                    float largura2 = scanner.nextFloat();
                    System.out.print("Altura: ");
                    float altura2 = scanner.nextFloat();
                    Retangulos retangulo2 = new Retangulos(largura2, altura2);
                    
                    System.out.println("Primeiro retangulo:");
                    System.out.println("Area:" + retangulo1.CalcArea());
                    System.out.println("Perimetro:" + retangulo1.CalcPerimetro());
                    
                    System.out.println("Segundo Retangulo:");
                    System.out.println("Area:" + retangulo2.CalcArea());
                    System.out.println("Perimetro:" + retangulo2.CalcPerimetro());
                    break;

                case 2:
                    Boolean loop = true;
                    
                    System.out.print("Digite o numero da conta: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o titular da conta: ");
                    String titular = scanner.nextLine();
                    System.out.print("Digite o saldo inicial: ");
                    float saldo = scanner.nextFloat();
                    
                    ContaBancaria conta = new ContaBancaria(numero, titular, saldo);
                    while (loop) {
                        System.out.println(" 1 -  Depositar");
                        System.out.println(" 2 -  Sacar");
                        System.out.println(" 3 -  Sair");
                        System.out.println("Escolha uma opção:");
                        int Escolha = scanner.nextInt();
                        
                        switch(Escolha){
                            case 1:
                                System.out.print("Digite a quantidade a depositar: ");
                                float valorDeposito = scanner.nextFloat();
                                conta.Depositar(valorDeposito);
                                System.out.println("Deposito efetuado: ");
                                conta.MostrarDados();
                                break;
                            case 2:
                                System.out.println("Digite a quantidade a ser sacada: ");
                                float valorSaque = scanner.nextFloat();  
                                conta.Sacar(valorSaque);
                                if (conta.saldo > valorSaque) System.out.println("Seu saque foi efetuado: ");
                                conta.MostrarDados();
                                break;
                            case 3:
                                System.out.println("Saindo...");
                                loop = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Instancias de Aluno: ");
                    Aluno aluno1 = new Aluno();
                    aluno1.mostrarDados();
                    Aluno aluno2 = new Aluno("joelson ", 123, "informatico");
                    aluno2.mostrarDados();
                    break;

                case 4:
                    System.out.println("Tipos de soma dado o tipo primitivo e array:");
                    System.out.println("Numeros: inteiros (33 e 33) fracionados (27.4 e 3.8) (exceto no caso do array onde os numeros serão {1, 2, 3}");
                    Calculadora teste1 = new Calculadora();
                    teste1.somar(33, 33);
                    teste1.ExibResul();
                    Calculadora teste2 = new Calculadora();
                    teste2.somar(27.4,3.8);
                    teste2.ExibResul();
                    Calculadora teste3 = new Calculadora();
                    teste3.soma(new int[]{1, 2, 3, 4});
                    teste3.ExibResul();
                    break;

                case 5:
                    HashSet<Contato> hashSet = new HashSet<>();
                    Contato contato1 = new Contato("Paulin Fonseca", "Paulover@mailmail.com", "(21)667872-3412");
                    Contato contato2 = new Contato("Paulin Fonseca Júnior", "Paulover@mailmail.com", "(21)662326-8384");
                    Contato contato3 = new Contato("Paulina Fonseca Maranhão", "Paulinea@mailmail.com", "(21)669029-7777");
                    System.out.println("Contato1: " + "Paulin Fonseca " + " Paulover@mailmail.com" + " (21)667872-3412  " + hashSet.add(contato1));
                    System.out.println("Contato2: " + "Paulin Fonseca Júnior " + " Paulover@mailmail.com" + " (21)662326-8384  " + hashSet.add(contato2));
                    System.out.println("Contato2: " + "Paulina Fonseca Maranhão " + " Paulinea@mailmail.com" + " (21)669029-7777  " + hashSet.add(contato3));
                    
                    for (Contato c : hashSet){
                        System.out.print("HashSet contido: ");
                        System.out.println(c);
                    }
                    break;

                case 6:
                    System.out.print("Informe seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe sua rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Informe o número de sua casa: ");
                    int numero0 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome de sua cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Informe o número de seu cep: ");
                    int cep = scanner.nextInt();
                    
                    Endereco endereco1 = new Endereco(rua, numero0, cidade, cep);
                    Pessoa pessoa1 = new Pessoa(nome, idade, endereco1);
                    
                    System.out.println(pessoa1);
                    break;

                case 7:
                    Funcionario f1 = new Funcionario("João Silva",12345678, 1500);
                    Gerente g1 = new Gerente("Maria Oliveira", 98765432, 1500);
                    Vendedor v1 = new Vendedor("Pedro Santos", 45678912, 1500);
                    Gerente g2 = new Gerente("Ana Costa", 32165498, 1500);
                    Vendedor v2 = new Vendedor("Lucas Almeida", 78912345, 2000);

                    System.out.println("Nome: " + f1.toString() + ", Salário: R$" + f1.CalcSalario());
                    System.out.println("Nome: " + g1.toString() + ", Salário: R$" + g1.CalcSalario());
                    System.out.println("Nome: " + v1.toString() + ", Salário: R$" + v1.CalcSalario());
                    System.out.println("Nome: " + g2.toString() + ", Salário: R$" + g2.CalcSalario());
                    System.out.println("Nome: " + v2.toString() + ", Salário: R$" + v2.CalcSalario());
                
                    ArrayList<Funcionario> funcionarios = new ArrayList<>();
                    
                    funcionarios.add(f1);
                    funcionarios.add(g1);
                    funcionarios.add(v1);
                    funcionarios.add(g2);
                    funcionarios.add(v2);
                    
                    System.out.println("Deseja ver a lista de Funcionarios em array?");
                    System.out.println("1 - sim");
                    System.out.println("2 - não");
                    int decision = scanner.nextInt();
                    
                    if(decision == 1){
                        for(Funcionario f :  funcionarios){
                            System.out.println(f + " " + f.CalcSalario());
                        }
                    } else System.out.println("retornando..");
                    break;

                case 9:
                    System.out.println("Deseja ver a chamada produto//funcionário//relatório//carta?");
                    System.out.println("1 - sim");
                    System.out.println("2 - não");
                    scanner.nextLine();
                    int decision2 = scanner.nextInt();
                    
                    if(decision2 == 1){
                        Produto Produtoex = new Produto("Pan de Potatu ", 12);
                        Relatorio Relaex = new Relatorio("ifday when?");
                        Carta cartex = new Carta("Hateletter numero uno");
                        Funcionario f2 = new Funcionario("João Silva",12345678, 1500);
                       
                        f2.imprimir();
                        Produtoex.imprimir();
                        Relaex.abrir();
                        cartex.abrir();
                    } else System.out.println("retornando.."); 
                    break;

                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}