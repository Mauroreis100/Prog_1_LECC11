package ListasEncadeadas;

public class ListaLigada {

	private Node primeiro;
	private Node ultimo;
	private int tamanho;
	
	//Construtor
	public ListaLigada() {
		this.tamanho=0;
	}
	
	//Metodo para adicionar um elemento
	public void adicionar(String valor) {
		Node newNode = new Node(valor);
		/*Se a primeira e ultima posicoe estiverem vazias,isso significa que
		a lista esta vazia e so adicionamos um elemento*/
		if(this.primeiro==null && this.ultimo==null) {
			this.primeiro=newNode;
			this.ultimo=newNode;//Um elemento foi adicionado
		}else {
			this.ultimo.setProximo(newNode);
			this.ultimo=newNode;
		}
		this.tamanho++;//Adiciona um elemento
	}
	
	//Metodo para remover um valor
	public void remover(String valorProcurado) {
		Node atual = primeiro;
		Node anterior=null;;
		for(int i=0;i<this.tamanho;i++) {
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
				if(atual==primeiro) {
					this.primeiro=atual.getProximo(); 
					atual.setProximo(null);
				}else if(atual == ultimo) {
					this.ultimo=anterior;
					anterior.setProximo(null);;
				}else {
					anterior.setProximo(atual.getProximo());
					atual=null;
				}
				anterior.setProximo(atual.getProximo());
				atual=null;
				
				break;
			}
			anterior = atual;
			atual=atual.getProximo();
		}
		this.tamanho--;
	}
	
	//Metodo para retornar um elemento
	public Node get(int indice) {
		Node atual = primeiro;
		for(int i=0;i<indice;i++) {
			//Verificar se tem proximo
			if(atual.getProximo()!= null) {
				atual=atual.getProximo();
			}
		}
		return atual;
	}
	
	//Metodo para percorrer ou imprimir a lista
	
	
	
	//Getters e Setters
	public Node getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}
	public Node getUltimo() {
		return ultimo;
	}
	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
