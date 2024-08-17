package cursoUdemy;

import java.util.Scanner;

public class IfElse_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu salário: ");
		double salario = input.nextDouble();
		double porcentagem;
		if (salario <= 2000.00) {
			porcentagem = 0.0;
		} else if (salario <= 3000.00) {
			porcentagem = (salario - 2000.00)* 0.08;
		} else if (salario <= 4500.0) {
			porcentagem = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			porcentagem = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
			if (salario == 0.0) {
				System.out.println("Isento");
			} else {
				System.out.printf("R$ %.2f%n",porcentagem);
			}

		input.close();
	}
}