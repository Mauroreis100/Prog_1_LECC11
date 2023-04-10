package finalmente;

public class Animal {
	//private int nome;
	private String nome;

	public Animal() {
		System.out.println("Criando um Animal");
	}

	//public int getNome() {
	public String getNome() {
		return nome;
	}

	//public void setNome(int nome) {
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String comer(String a) {
		return a;
	}

	public String toString() {
		return "Nome: " + nome;
	}

}
