package cursoUdemy;

import java.util.Scanner;

public class While_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Tente descobrir a senha de 4 dígitos!");
		int senha = input.nextInt();
	
		System.out.println("1 - O número 0462 contém dois dígitos certos mas só um na posição errada\n2 - O número 9875 está completamente errado\n3 - O número é o ano de lançamento de Cidade de Deus\n4 - Neymar possuía 10 anos nesse ano\n");
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = input.nextInt();

		}
		System.out.println("Acesso Permitido");
		input.close();
	}

}
