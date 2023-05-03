package objecto;

class LinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node inicio;
	int tamanho;

	// 1. Criacao de uma Lista Vazia
	public LinkedList() {
		this.inicio = null;
		this.tamanho = 0;
//Elemento chamamos de marcados
	}

//Count
	public int count() {
		// O inicio terá 0 e assim sucessivamente
		return this.tamanho;
	}

	// 2. Listagem de todos elementos da lista
	public void listAll() {
		if (this.count() == 0) {
			System.out.println("Lista Vazia");
		} else {
			Node currentNode = this.inicio;
			while (currentNode.next != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
				// Computase a direita e depois atribuisi a aesquerda
			}
			System.out.println(currentNode.data);
		}
	}

	// 3. Adicao de um elemento a lista
	public void add(int valor) {
		// Criamos o elemento na memoria sem fazer parte da lista ligada
		Node novoNode = new Node(valor, null);

		// Se alista estiver vazia, o novo elemento parra a ser o primeiro da lista
		if (this.count() == 0) {
			this.inicio = novoNode;

		} else {
			// Percorrer toda lista ate encontrar um elemento que nao tenha seguinte
			// (next==null)
			Node currentNode = this.inicio;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
				// Computase a direita e depois atribuisi a aesquerda
			}
			currentNode.next = novoNode;

		}
		this.tamanho++;
	}

	// 4. Adicao de um elemento no inicio da lista
	public void addFirst(int valor) {
		Node newNode = new Node(valor, null);
		newNode.next = this.inicio;
		this.inicio = newNode;
		this.tamanho++;
	}

	// 5. Adicao de um elemento no inicio da lista
	public void addLast(int valor) {
		this.add(valor);
	}

	// 6. Adicao de um elemento em posicai na lista
	public boolean addAt(int valor, int indice) {
		if (indice < 0 || indice > tamanho) {
			return false;
		} else {
			int contador = 0;
			Node newNode = new Node(valor, null);
			Node currentNode = this.inicio;
			while (currentNode.next != null && contador < indice - 1) {

				currentNode = currentNode.next;
				contador++;
				// Computase a direita e depois atribuisi a aesquerda
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
			return true;
		}
	}

	public static void main(String args[]) {
		// 1. Criacao
		LinkedList LL = new LinkedList();

		// Contagem da Lista
		System.out.println(LL.count());

		// 2. Listagem de elementos da lista
		LL.listAll();

		// 3. Adicao de um elemento a lista
		LL.add(1);
		LL.add(2);
		LL.add(4);
		LL.listAll();
		System.out.println(LL.count());
		// 4. Adicao de um elemento no inicio lista
		System.out.println("addFirst(8): ");
		LL.addFirst(8);
		System.out.println("addFirst(9): ");
		LL.addFirst(9);
		LL.listAll();
		// 5. Adicao de um elemento no fim da lista
		// System.out.println("addLast(1): " + LL.addLast(1));

		// Insercao num sitio especifico
		System.out.println(LL.addAt(3, 10));
		LL.listAll();
	}
}
