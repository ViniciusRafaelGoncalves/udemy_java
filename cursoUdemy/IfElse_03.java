package cursoUdemy;

import java.util.Scanner;

public class IfElse_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("Digite o 1º número: ");
		num1 = input.nextInt();
		System.out.print("Digite o 2º número: ");
		num2 = input.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		input.close();
	}

}
