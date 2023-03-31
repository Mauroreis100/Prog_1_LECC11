package pessoa;

public class Pessoa {
	private String nome, sexo;
	private short idade;
	
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
	public short getIdade() {
		return idade;
	}
	public void setIdade(short idade) {
		this.idade = idade;
	}
	
	public Pessoa() {}
	
	public Pessoa(String nome, String sexo, short idade) {
	
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
	
	
	
	
}
