package application;

import java.util.Scanner;

import entities.Conta;
import exceptions.NegocioException;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados da conta");
		System.out.print("Número: ");
		Integer numero = sc.nextInt();
		System.out.print("Dono: ");
		sc.nextLine();
		String dono = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limiteSaque = sc.nextDouble();

		Conta conta = new Conta(numero, dono, saldoInicial, limiteSaque);

		System.out.print("\nDigite quanto quer sacar: ");
		Double quantia = sc.nextDouble();

		try {
			conta.saque(quantia);
			System.out.printf("%.2f%n", conta.getSaldo());
		} 
		catch (NegocioException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
