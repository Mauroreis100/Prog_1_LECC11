package objecto;

public class Produto {
	private String nomeLoja;
	private double preco;
	private String descricao;

	public String getDescricao() {
		return "Produto de informática";
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto(String nomeLoja, double preco) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nomeLoja=" + nomeLoja + ", preco=" + preco;
	}

}
