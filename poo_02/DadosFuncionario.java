package poo_02;

import java.util.Locale;
import java.util.Scanner;

public class DadosFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario();
		Scanner input = new Scanner(System.in);

		System.out.print("Nome: ");
		funcionario.nome = input.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = input.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = input.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + funcionario.nome + ", $" + funcionario.salarioLiquido());

		System.out.println();
		System.out.print("Que porcentagem quer acrescentar ao salário?: ");
		double porcentagem = input.nextDouble();
		funcionario.incrementarSalario(porcentagem);

		System.out.println();
		System.out.println("Atualização dos dados: " + funcionario.nome + ", $" + funcionario.salarioLiquido());

		input.close();
	}

}
