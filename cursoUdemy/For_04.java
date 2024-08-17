package cursoUdemy;

import java.util.Scanner;

public class For_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			int dividendo = input.nextInt();
			int divisor = input.nextInt();
			
			if(divisor == 0) {
				System.out.println("Divisão impossivel");
			}else {
				double divisao = (double)dividendo/divisor;
				System.out.printf("%.1f%n",divisao);
			}
		}
		input.close();
	}
}