package pessoa;

public class Pessoa {
	
	//public static final String getNome = null;
	//Atributos
	String id, nome;
	byte idade;
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	
	//metodo para "fazer aniversario"
	public void FazerAniversario() {
		byte niver=(byte) (this.idade+1);
		this.idade = niver;
	}
	
	public void mostrar(String nome) {
		System.out.println(" Nome: "+nome+" tem idade "+this.idade);
	}
	
}
