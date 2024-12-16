package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		int n, nMenores;
		double alturaMedia, percentualMenores, alturaTotal;

		System.out.print("Quantas pessoas serão digitadas?: ");
		n = sc.nextInt();
		sc.nextLine();

		People[] people = new People[n];

		nMenores = 0;

		for (int i = 0; i < people.length; i++) {
			System.out.printf("Dados da %dª pessoa\n", i + 1);

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();

			people[i] = new People(nome, idade, altura);

			if (idade < 16) {

				nMenores++;
			}
		}

		alturaTotal = 0;
		for (int i = 0; i < n; i++) {
			alturaTotal += people[i].getAltura();
		}
		alturaMedia = alturaTotal / people.length;
		System.out.printf("Media das alturas: %.2f%n", alturaMedia);
		
		percentualMenores = ((double)nMenores/people.length) * 100;
		System.out.printf("Pessoas menores de 16 anos: %.1f%%%n", percentualMenores);
		for(int i = 0; i < people.length ; i++) {
			if(people[i].getIdade()<16) {
				System.out.println(people[i].getNome());
			}
		}
		

		sc.close();
	}

}
