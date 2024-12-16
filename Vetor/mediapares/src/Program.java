package src;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int soma = 0;
		int npares = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vet = new int[n];
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				npares++;
			}

		}

		if (npares <= 0) {
			System.out.println("NENHUM NUMERO PAR");

		} else {

			double media = (double)soma / npares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}

		sc.close();
	}

}
