package exemplarObjecto;

public class Empresa {
	private int id;
	private String nome, endereco;

	public Empresa() {
	}

	public Empresa(int id) {
		this.id = id;
	}

	public Empresa(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	// generate toString
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// public Empresa() {}

}
