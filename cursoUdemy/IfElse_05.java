package cursoUdemy;

import java.util.Scanner;

public class IfElse_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o código do item desejado (1 a 5): ");
		int codigo = input.nextInt();
		System.out.print("Digite a quantidade desejada: ");
		int quantidade = input.nextInt();
		double total;
		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.print("Total da conta: " + total);
		} else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.print("Total da conta: " + total);
		} else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.print("Total da conta: " + total);
		} else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.print("Total da conta: " + total);
		} else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.print("Total da conta: " + total);
		} else {
			System.out.print("Produto não encontrado!!");
		}
		input.close();
	}
}
