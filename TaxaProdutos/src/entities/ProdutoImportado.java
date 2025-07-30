package entities;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandegaria;

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public Double getTaxaCustomizada() {
		return taxaAlfandegaria;
	}

	public void setTaxaCustomizada(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public double precoTotal() {
		return getPreco() + taxaAlfandegaria;
	}
	
	@Override	
	public String etiquetaDePreco() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", precoTotal()) 
				+ "(Taxa extra $ " 
				+ String.format("%.2f", taxaAlfandegaria)
				+ ")";
	}
	
}
