package objecto;

public class Pessoa2 {
	private String nome, sexo, endereco;
	private int idadePessoa;

	public Pessoa2(String nome, String sexo, String endereco, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.idadePessoa = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idadePessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", endereco=" + endereco + ", idade=" + idadePessoa + "]";
	}
	
	
	
	

}
