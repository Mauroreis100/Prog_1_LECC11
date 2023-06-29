package whatsapp;

/**
 * Classe Pessoa com os atributos, e constutor, um metodo get e set : 3 pontos
 * M�todo desloca : 2 Pontos 
 * @author
 *
 */

public class Pessoa {
	private int id;
	private String nome;
	private String sexo;
	
	public Pessoa(int id, String nome, String sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}

	//Criar um get e um set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	//Crie um m�todo chamado desloca que devolve a mensagem �Pessoa desloca-se�
	public String desloca()
	{
		return "Pessoa desloca-se";
	}
	
	
	
	@Override
	public String toString() {
		return id +" ,"+ nome +" ,"+sexo;
	}
}
