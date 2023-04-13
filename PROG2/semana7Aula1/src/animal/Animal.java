package animal;


public class Animal{
	private String nome;
	
	//System.out.println("");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String toString() {
		return "Animal [nome=" + nome + "]";
	}
	
	public String comer() {
		return "";
	}
	
	//System.out.println("Criacao do animal");
	
}
