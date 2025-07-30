package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionariosTerceirizados;

public class Program {

	public static void main(String[] args) {
		
		List <Funcionario> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a quantidade de funcionarios: ");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Dados do funcionario #" + (i+1));
			System.out.print("Terceirizado? (y/n) ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				list.add(new FuncionariosTerceirizados(nome, horas, valorPorHora, despesaAdicional));
			}
			else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
			
			System.out.println();
			
			
		}
		
		System.out.println("PAGAMENTOS:");
		
		for(Funcionario func : list) {
			System.out.println(func.getNome() + " - $ " + func.pagamento());
		}
		sc.close(); 
	}

}
