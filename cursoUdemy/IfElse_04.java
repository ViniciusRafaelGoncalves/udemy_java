package cursoUdemy;

import java.util.Scanner;

public class IfElse_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite a hora de início da partida: ");
		int horaInicial = input.nextInt();
		System.out.print("Digite a hora do fim da partida: ");
		int horaFinal = input.nextInt();
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + " hora(s)");
		input.close();
	}
}
