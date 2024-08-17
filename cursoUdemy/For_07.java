package cursoUdemy;

import java.util.Scanner;

public class For_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1; i<=n; i++) {
			int quad = i*i;
			int cub = i*i*i;
			System.out.printf("%d %d %d%n", i,quad,cub);
		}
	input.close();
	}

}
