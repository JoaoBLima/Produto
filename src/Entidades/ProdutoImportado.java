package Entidades;

public class ProdutoImportado extends Produto {
	
	private double taxa;

	

	public ProdutoImportado(String nome, double preco, double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	

	public double precototal() {
		return getPreco() + taxa;
	}
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " R$ " 
				+ String.format("%.2f", precototal())
				+ " (Taxa alfandegária: R$ " 
				+ String.format("%.2f", taxa)
				+ ")";
	}
}
