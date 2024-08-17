package poo_04;

public class Calculadora {
	public static final double PI = Math.PI;

	public static double circumference(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
