package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double taxinha;
		if (getRendaAnual() < 20000.00) {
			taxinha = getRendaAnual() * 0.15;

		} else {
			taxinha = getRendaAnual() * 0.25;
		}
		taxinha -= (getGastosSaude() * 0.5);
		if (taxinha < 0) {
			taxinha = 0;
		}
		return taxinha;
	}

}
