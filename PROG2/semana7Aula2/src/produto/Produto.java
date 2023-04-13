package produto;

public class Produto {
	private String nomeLoja, descricao;
	private double preco;
	
	
	public Produto(String nomeLoja, double preco) {
		
		this.nomeLoja = nomeLoja;
		this.preco = preco;
	}
	
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public String getDescricao() {
		return "Produto de informatica";	
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [nomeLoja=" + nomeLoja + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
}
