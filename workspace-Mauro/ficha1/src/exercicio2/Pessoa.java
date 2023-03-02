package exercicio2;

public class Pessoa {
	private int id, idade;
	private String nome, nacionalidade;

	public Pessoa() {
	}

	public Pessoa(int id) {
		this.id = id;
	}

	public Pessoa(int id, String nome, int idade, String nacionalidade) {
		this.id = id;
		this.nome = nome;
		this.idade=idade;
		this.nacionalidade = nacionalidade;
	}
}
