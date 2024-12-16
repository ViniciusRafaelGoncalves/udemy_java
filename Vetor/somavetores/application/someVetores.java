package application;

import java.util.Locale;
import java.util.Scanner;

public class someVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double sum, media;

		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];

		sum = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum = sum + vect[i];
			
		}
		

		System.out.print("\nVALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		media = sum/n;
		System.out.printf("\nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
