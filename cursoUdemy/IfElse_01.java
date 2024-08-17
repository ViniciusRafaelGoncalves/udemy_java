package cursoUdemy;

import java.util.Scanner;

public class IfElse_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número desejado: ");
		int num = input.nextInt();
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		input.close();
	}

}
