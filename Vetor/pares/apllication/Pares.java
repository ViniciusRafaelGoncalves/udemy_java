package apllication;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n, qtdPares;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.print("\nNUMEROS PARES: ");

		qtdPares = 0;
	    for (int i=0; i<n; i++) {
	        if (vect[i] % 2 == 0) {
	        	System.out.printf("%d  ", vect[i]);
	            qtdPares++;
	        }
	    }

	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);

		sc.close();
	}
}