package poo_02;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		double salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;
	}

	public void incrementarSalario(double porcentagem) {
		double aumento = salarioBruto * (porcentagem/100.0);
		salarioBruto += aumento;
	}
}
