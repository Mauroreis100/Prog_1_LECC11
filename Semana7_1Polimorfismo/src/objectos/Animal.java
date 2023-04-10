package objectos;

public class Animal {
	//private int nome;
	private final String nome;

	/*Final no atributo nome The final field Animal.nome cannot be assigned*/
	public Animal() {
		System.out.println("Criando um Animal");
	}

	//public int getNome() {
	public String getNome() {
		return nome;
	}

	//public void setNome(int nome) {
	public void setNome(String nome) {
		//Final no atributo nome The final field Animal.nome cannot be assigned
		this.nome = nome;
	}

	public String comer() {
		return "Animal Comendo";
	}

	public String toString() {
		return "Nome: " + nome;
	}

}
