package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException{

		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados produto #" + i);
			System.out.print("Comum, usado ou importado (c/u/i): ");
			String escolha = sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if(ch == 'c') {
				lista.add(new Produto(nome, preco));
			}
			else if(ch == 'i') {
				System.out.print("Taxa alfandegária: ");
				double taxaAlfandegaria = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
			}
			else {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			
		}
		System.out.println();
		for(Produto prod : lista) {
			System.out.println(prod.etiquetaDePreco());
		}
		
		sc.close();
	}

}
