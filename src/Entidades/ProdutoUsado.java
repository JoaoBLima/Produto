package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoUsado extends Produto{
	private LocalDate fabricacao;

	
	public ProdutoUsado(String nome, double preco, LocalDate fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}


	public LocalDate getFabricacao() {
		return fabricacao;
	}


	public void setFabricacao(LocalDate fabricacao) {
		this.fabricacao = fabricacao;
	}


	@Override
	public String etiqueta() {
		return getNome() 
				+ " (usado) R$ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+ fabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}


}
