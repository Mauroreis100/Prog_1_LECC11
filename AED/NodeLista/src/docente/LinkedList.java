package docente;

public class LinkedList {
	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data, Node prev, Node next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

	Node inicio;
	Node fim;
	int tamanho;

	// 1. Criacao de uma Lista Vazia
	public LinkedList() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	// Contagem de elementos
	public int count() {
		return this.tamanho;
	}

	public boolean isEmpty() {
		return this.count() == 0;
	}

	// 2. Listagem de todos elementos da lista
	// order: 1 crescente, -1 decrescente
	public void listAllCrescente() {
		Node currentNode = this.inicio;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public void listAllDecrescente() {
		Node currentNode = this.fim;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.prev;
		}
	}

	public void listAll(int order) {
		if (this.count() == 0) {
			System.out.println("Lista Vazia");
		} else {
			if (order == 1) {
				listAllCrescente();
			} else {
				listAllDecrescente();
			}
		}
	}

	// 3. Adicao de um elemento a lista
	public void add(int valor) {
		// Criamos o elemento na memoria sem fazer parte da
		// Lista Ligada
		Node newNode = new Node(valor, null, null);

		// Se a lista estiver vazia, o novo elemento
		// passa a ser o primeiro da lista
		if (this.count() == 0) {
			this.inicio = newNode;
			this.fim = this.inicio;
		} else {
			// Percorremos toda lista ate encontrar um elemento
			// que nao tenha seguinte (next == null)
			Node currentNode = this.inicio;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.prev = currentNode;
			this.fim = newNode;
		}

		this.tamanho++;
	}

	// 4. Adicao de um elemento no inicio da lista
	public void addFirst(int valor) {
		Node newNode = new Node(valor, null, null);
		newNode.next = this.inicio;
		this.inicio = newNode;
		this.tamanho++;
	}

	// 5. Adicao de um elemento no inicio da lista
	public void addLast(int valor) {
		this.add(valor);
	}

	// // 6. Adicao de um elemento em posicao na lista
	// public boolean addAt(int valor, int indice) {
	// if (indice < 0 || indice > tamanho) {
	// return false;
	// }
	// Node newNode = new Node(valor, null, null);
	// Node currentNode = this.inicio;
	// int contador = 0;
	// while (currentNode.next != null && contador < indice - 1) {
	// currentNode = currentNode.next;
	// contador++;
	// }
	// newNode.next = currentNode.next;
	// currentNode.next = newNode;
	// this.tamanho++;
	// return true;
	// }

	// // 7. Remover um elemento no fim da lista
	// RemoteLast
	// Arshad - Ilidio - Kevin - Mauro
	// 7. Remover um elemento no fim da lista
	public boolean removeLast() {
		if (this.isEmpty() == true) {
			return false;
		} else {
			this.fim = this.fim.prev;
			(this.fim.next).prev = null;
			this.fim.next = null;
			this.tamanho--;
			return true;
		}
	}

	// // 8. Remover elemento no inicio
	// public boolean removeFirst() {
	// if (this.isEmpty() == true) {
	// return false;
	// } else {
	// this.inicio = this.inicio.next;
	// this.tamanho--;
	// return true;
	// }

	// }

	// // TPC 9. Remover elemento em posicao
	// public boolean removeAt() {
	// }

	public static void main(String args[]) {
		// 1. Criacao
		LinkedList LL = new LinkedList();

		// Contagem de elementos presentes na lista
		System.out.println("count: " + LL.count());

		// 2. Listagem de elementos da lista
		LL.listAll(1);

		// 3. Adicao de um elemento a lista
		LL.add(1);
		LL.add(2);
		// System.out.println("count: " + LL.count());
		LL.listAll(1);
		LL.listAll(-1);

		// // 4. Adicao de um elemento no inicio lista
		// System.out.println("addFirst(3): ");
		// LL.addFirst(3);
		// LL.listAll();

		// // 5. Adicao de um elemento no fim da lista
		// // System.out.println("addLast(3): " + LL.addLast(3));
		// System.out.println("addAt(4,-1): " + LL.addAt(4, -1));
		// System.out.println("addAt(4,1): " + LL.addAt(4, 1));
		// LL.listAll();

		// // 7. Remover um elemento no fim da lista
		// System.out.println("removeLast: " + LL.removeLast());
		// LL.listAll();

		// // 8. Remover um elemento no inicio da lista
		// System.out.println("removeFirst: " + LL.removeFirst());
		// LL.listAll();
		// System.out.println("count: " + LL.count());
	}
}
