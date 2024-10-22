package pacote;

public class Quarto {
	private Integer numQuarto;
	private String tipoQuarto;
	private Double preco;
	private Boolean disponibilidade;
	
	public Quarto(Integer numQuarto, String tipoQuarto, Double preco, Boolean disponibilidade) {
		this.numQuarto = numQuarto;
		this.tipoQuarto = tipoQuarto;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}


	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}


	public String getTipoQuarto() {
		return tipoQuarto;
	}


	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Boolean getDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = true;
	}

	public String toString() {
		return "Quartos [numQuarto=" + numQuarto + ", tipoQuarto=" + tipoQuarto + ", preco=" + preco
				+ ", disponibilidade=" + disponibilidade + "]";
	}
}
