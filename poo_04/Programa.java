package poo_04;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio = input.nextDouble();
		double c = Calculadora.circumference(raio);
		double v = Calculadora.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculadora.PI);
		
		input.close();
	}

}
