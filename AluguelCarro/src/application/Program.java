package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.ImpostoBrasil;
import model.service.ServicoAluguel;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);
		
		AluguelCarro ac = new AluguelCarro(start, finish, new Veiculo(modelo));
		
		System.out.print("Digite o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Digite o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel sa = new ServicoAluguel(precoPorHora, precoPorDia, new ImpostoBrasil());
		
		sa.processoFatura(ac);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", ac.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", ac.getFatura().getImposto()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getPagamentoTotal()));
		
		sc.close();
	}

}
