package cursoUdemy;

import java.util.Scanner;

public class IfElse_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		double valor = input.nextDouble();
		if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (valor <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (valor <= 75.0) {
			System.out.println("Intervalo [50,75]");
		} else {
			System.out.println("Intervalo [75,100]");
		}
		input.close();
	}

}
