package poo_05;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("What is the dollar price? ");

		double dolar = input.nextDouble();
		System.out.print("How many dollars will be bought? ");

		double quantity = input.nextDouble();
		System.out.printf("Amount to be paid in reais =  %.2f%n", CurrencyConverter.reais(dolar, quantity));

		input.close();
	}

}
