package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Digite a quantidade dos pagadores de imposto: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Pagante #" + i + " dados:");
			System.out.print("Individual ou companhia (i/c)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (resp == 'i') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				Integer numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		double soma = 0.0;
		System.out.println("\nIMPOSTO PAGO: ");
		for (Pessoa p : list) {
			soma += p.imposto();
			System.out.println(p.getNome() + ": $" + String.format("%.2f", p.imposto()));

		}
		sc.close();
	}
}
