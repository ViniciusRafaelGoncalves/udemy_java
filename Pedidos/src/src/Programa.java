package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.OrdemPedido;
import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		OrdemPedido status = OrdemPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos itens terá nesse pedido? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do " + i + "º item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do produto: ");
			double valorProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, valorProduto);
			
			ItemPedido ip = new ItemPedido(quantidade, valorProduto, produto);
			pedido.adicionarItem(ip);	
		}
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);

		sc.close();
	}

}
