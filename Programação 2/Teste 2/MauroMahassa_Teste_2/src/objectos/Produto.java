package objectos;

public class Produto {
	private int id,qtd;
	private String nome;
	private double preco;
	
	public Produto(int id,String nome, int qtd, double preco) {
		this.id = id;
		this.qtd = qtd;
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", qtd=" + qtd + ", nome=" + nome + ", preco=" + preco + "MT ]";
	}

	
	
}
