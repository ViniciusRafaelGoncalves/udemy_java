package poo_01;

import java.util.Locale;
import java.util.Scanner;

public class ValoresDoRetângulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
	
		System.out.println("Digite a base do seu retângulo: ");
		retangulo.base = input.nextDouble();
		System.out.println("Digite a altura do seu retângulo: ");
		retangulo.altura = input.nextDouble();

		System.out.println("Área: " + retangulo.area());
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		input.close();
	}

}
