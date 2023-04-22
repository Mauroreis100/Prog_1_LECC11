package lsenquencial;

import java.util.Iterator;

public class ListaSequencias {
	private int lista[];
	private int tamanho;

	// 1. Criacao
	public ListaSequencias(int capacidade) {
		this.lista = new int[tamanho];
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
			for (int i = 0; i < this.count(); i++) {
				System.out.print(this.lista[i] + " ");
			}
		}
	}

	// 5. Adicionar um elemento à lista
	public boolean add(int elemento) {
		if (this.count() >= this.lista.length) {
			return false;
		} else {
			lista[tamanho]=elemento;
			this.tamanho++;
			return true;
		}
	}

	// 6. Adicionar um elemento à lista em um indice especifico
	public boolean addAt(int elemento, int indice) {
		return true;
	}

	// 7. Verificar se um elemento existe ou nao na lista
	public boolean exists(int elemento) {		return true;
	}

	// 8. Remover um elemento da lista
	public boolean remove(int elemento) {		return true;
	}

	// 9. Remover um elemento da lista de um indice especifico
	public boolean removeAt(int elemento, int indice) {		return true;
	}
	 public static void main() {
	        // 1. Criacao de uma ListaSequencial
	        ListaSequencias LS = new ListaSequencias(5);

	        // 2. Retornar a contagem de elementos presentes na lista
	        // LS.count();
	        System.out.println("count"+LS.count());
	        // 3. Determinacao se esta ou nao vazia
	        // LS.isEmpty();

	        // 4. Mostrar todos elementos da lista
	        // LS.listAll();
	  
	        // 5. Adicionar um elemento à lista
	        // LS.add(1);
	        // LS.count();

	        // 6. Adicionar um elemento à lista em uma posição 
	        // LS.addAt(2, 2);

	        // 7. Verificar a existencia de um elemento
	        // LS.exists(2);

	        // 8. Remover um elemento, se existir
	        // LS.remove(3);
	        // LS.remove(2);

	        // 9. Remover um elemento em um indice
	        // LS.removeAt(1)
	    }
}

