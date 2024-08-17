package cursoUdemy;

import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o raio desejado: ");
		double raio = input.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("Área do círculo: %.4f\n", area);
		input.close();
	}

}