package object;

public class Funcionario {
	private String nome, sexo;
	private int idade;
	public Funcionario() {
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade;
	}
	
}
