package ListasEncadeadas;

public class Node {
	
	private String valor;
	private Node proximo;
	
	//Construtor
	public Node(String valor) {
		this.valor=valor;
	}
	
	//Getters e Setters
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
}	