package poo_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro;
        System.out.print("Digite o número da conta: ");
        int numConta = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Esse é um depósito inicial (s/n)?");
        char resposta = sc.next().charAt(0);
            if (resposta == 's') {
                System.out.print("Valor do depósito: ");
                double depInicial = sc.nextDouble();
                cadastro = new Cadastro(numConta, titular, depInicial);
            }
            else{
                cadastro = new Cadastro(numConta, titular);
            }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(cadastro);

        System.out.println();
        System.out.print("Digite um valor de depósito: ");
        double valorDeposito = sc.nextDouble(); 
        cadastro.deposito(valorDeposito);   

        System.out.println();
        System.out.println("Dados da conta atualizados: ");
        System.out.println(cadastro);

        System.out.println();
        System.out.print("Digite um valor de saque: ");
        double valorSaque = sc.nextDouble(); 
        cadastro.saque(valorSaque);

        System.out.println();
        System.out.println("Dados da conta atualizados: ");
        System.out.println(cadastro);

        sc.close();
    }
}