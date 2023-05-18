package lsenquencial;

import java.util.Iterator;

public class ListaSequencial {
	private int lista[];
	private int tamanho;

	// 1. Criacao
	public ListaSequencial(int capacidade) {
		this.lista = new int[capacidade];
		this.tamanho = 0;
	}

	// 2. Determinar o numero de elementos presentes na lista
	public int count() {
		return this.tamanho;
	}

	// 3. Determinar se esta ou nao vazia
	public boolean isEmpty() {
		return this.count() == 0;
	}

	// Ver se está cheia
	public boolean isFull() {
		return this.tamanho == this.lista.length;
	}

	// 4. Listagem de todos elementos presentes na lista
	public void listAll() {
		if (this.isEmpty() == true) {
			System.out.println("Lista Vazia");
		} else {
			for (int i = 0; i < this.lista.length; i++) {
				// if (this.lista[i] == 0) {
				System.out.print(this.lista[i] + " ");
				// }
			}
		}
	}

	// 5. Adicionar um elemento à lista
	public boolean add(int elemento) {
		// Significa que a lista está cheia
		if (this.count() >= this.lista.length) {
			return false;
		} else {
			lista[tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		// return this.addAt(elemento, this.tamanho);
	}

	// 6. Adicionar um elemento à lista em um indice especifico
	public boolean addAt(int elemento, int indice) {
		if (this.isFull()) {
			return false;
		} else {
			this.lista[indice] = elemento;
			this.tamanho++;
			return true;
		}
	}

	// 7. Verificar se um elemento existe ou nao na lista
	public boolean exists(int elemento) {
		for (int i = 0; i < this.lista.length; i++) {
			if (this.lista[i] == elemento) {
				return true;
			}
		}
		return true;
	}

	// 8. Remover um elemento da lista
	public boolean removeLast() {
		if (this.isFull()) {
			return false;
		} else {
			this.lista[tamanho] = 0;
			tamanho--;
			return true;
		}
	}

	// 9. Remover um elemento da lista de um indice especifico
	public boolean removeAt(int elemento, int indice) {
		if (exists(elemento)) {
			this.lista[indice] = 0;
			this.tamanho--;
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		// 1. Criacao de uma ListaSequencial
		ListaSequencial LS = new ListaSequencial(5);

		// 2. Retornar a contagem de elementos presentes na lista
		// LS.count();
		System.out.println("count: " + LS.count());
		// 3. Determinacao se esta ou nao vazia
		System.out.println("Está vazio?: " + LS.isEmpty());
		LS.add(1);

		// 4. Mostrar todos elementos da lista
		LS.listAll();

		// 5. Adicionar um elemento à lista
		LS.add(3);
		LS.listAll();
		System.out.println("count " + LS.count());

		// 6. Adicionar um elemento à lista em uma posição
		// LS.addAt(2, 2);

		// 7. Verificar a existencia de um elemento
		System.out.println("Exite 2: " + LS.exists(2));

		// 8. Remover um elemento, se existir
		LS.removeLast(3);
		// LS.remove(2);

		// 9. Remover um elemento em um indice
		// LS.removeAt(1)
	}
}
