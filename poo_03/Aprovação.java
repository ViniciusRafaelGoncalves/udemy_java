package poo_03;

import java.util.Locale;
import java.util.Scanner;

public class Aprovação {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Estudante estudante = new Estudante();

		System.out.print("Nome do aluno: ");
		estudante.nome = input.nextLine();

		System.out.println();
		System.out.print("Nota do 1º trimestre: ");
		estudante.a = input.nextDouble();

		System.out.print("Nota do 2º trimestre: ");
		estudante.b = input.nextDouble();

		System.out.print("Nota do 3º trimestre: ");
		estudante.c = input.nextDouble();

		estudante.media();

		System.out.println();
		System.out.println("Média do aluno: " + estudante.nome + " " + estudante.media());
		 
		estudante.aprovacao();

		input.close();
	}

}
