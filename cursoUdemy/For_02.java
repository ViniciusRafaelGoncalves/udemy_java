package cursoUdemy;

import java.util.Scanner;

public class For_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			int x = input.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}

		}
		System.out.println(in + " in\n" + out + " out");
		input.close();
	}

}
