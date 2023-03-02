package exercicio2;

public class Pessoa {
	// Definição das variaveis da classe
	private int id, idade;
	private String nome, nacionalidade;

	// Metodo da classe pessoa, vazio
	public Pessoa() {
	}
//metodo de id soz
	public Pessoa(int id) {
		this.id = id;
	}

	// metodo da classe pessoa com todas as variaveis, usado para definir os valores
	// das variaveis
	public Pessoa(int id, String nome, int idade, String nacionalidade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
	}

	// Permite recuperar dados que foram primeiramente set,
	// Não tens como recuperar dados sem primeiro fazer o set ou definir como vimos
	// A ser feito na classe start
	public int getId() {
		return id;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	// Atribuição de dados
	public void setId(int id) {
		this.id = id;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	//Metodo to string pega todos os dados da classe e imprime de uma vez
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nacionalidade=" + nacionalidade + ", id=" + id + ", idade=" + idade + "]";
	}

	/*
	 * Acho que ao inves de to string temos de usar este...
	 * public static String imprimiDadosPessoa(Pessoa p) { //implementação método
	 * return "fsa"; }
	 */

}
