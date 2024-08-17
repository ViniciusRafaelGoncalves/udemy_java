package cursoUdemy;

import java.util.Scanner;

public class While_02 {

	public static void main(String[] args) {

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha um tipo de combustível para abastecer:\n" + "1 - Álcool\n" + "2 - Gasolina\n"
				+ "3 - Diesel\n" + "4 - Fim\n");

		int tipo = input.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			} else if (tipo == 2) {
				gasolina++;
			} else if (tipo == 3) {
				diesel++;

			}
			tipo = input.nextInt();

		}
		System.out.println("MUITO OBRIGADO\n" + "Álcool: " + alcool + "\n" + "Gasolina: " + gasolina + "\n" + "Diesel: "
				+ diesel + "\n");
		input.close();
	}
}