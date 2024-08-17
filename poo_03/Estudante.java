package poo_03;

public class Estudante {
	public String nome;
	public double a;
	public double b;
	public double c;

	public double media() {
		double media = a + b + c;
		return media;
	}

	public void aprovacao() {
		double falta = 60 - media();

		if (media() >= 60) {
			System.out.println("PASS");
		} else {

			System.out.println("FAILED");
			System.out.print("Faltaram " +  falta + " pontos" );
		}
	}
}
