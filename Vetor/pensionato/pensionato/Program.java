package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		sc.nextLine();

		People[] pp = new People[n];
		
		for(int i = 0; i < pp.length; i ++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			pp[i] = new People(nome,email,room);
			
		}
		sc.close();
	}

}
