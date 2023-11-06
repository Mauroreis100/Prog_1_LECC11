package teste2;

public class Stock {
	private int id;
	private String nome;
	private int quantidade;
	private double preco;


	public Stock(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco=preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getquantidade() {
		return quantidade;
	}

	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getpreco() {
		return preco;
	}

	public void setpreco(double preco) {
		this.preco = preco;
	}



	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco;
	}

	
}
