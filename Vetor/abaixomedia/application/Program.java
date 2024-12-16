package src;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		double media = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vet = new double[n];
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();

		}
		for (int i = 0; i < vet.length; i++) {
			media = media + vet[i];
		}

		double calcMedia = media / vet.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", calcMedia);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < calcMedia) {
				System.out.println(vet[i]);
			}
			sc.close();

		}
	}
}