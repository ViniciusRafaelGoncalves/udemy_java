package cursoUdemy;

import java.util.Scanner;

public class IfElse_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número desejado: ");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		input.close();
	}

}
