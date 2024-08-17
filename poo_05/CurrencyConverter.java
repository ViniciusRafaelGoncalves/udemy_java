package poo_05;

public class CurrencyConverter {

	public static final double tax = 0.06;	

	public static double reais(double dolar, double quantity) {
	double total = dolar * quantity;
	return tax * total + total;
}
}
