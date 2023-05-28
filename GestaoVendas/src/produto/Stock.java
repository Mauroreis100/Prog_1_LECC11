package produto;

import java.util.Vector;

public class Stock {
/*Ao adicionar um produto novo ao STOCK deve 
- Pegar a lista
- Ver se já existe com o método existe(nome,lista)
- Caso exista, apenas aumenta a quantidade daquele produto
- Caso não exista coloque um produto novo que vai ocupar uma posição nova
*/
	//Adicionar produtos no armazém
	public Vector adicionarNovoProduto(Vector lista, Produto prod) {
		if(existe(prod.getNome(),lista)) {
			int index=procurarNome(prod.getNome(),lista);
			return aumentarQtd(lista,((Produto)lista.elementAt(index)).getId(),1);
		}
		prod.setQtd(prod.getQtd() + 1);
		lista.add(prod);
		return lista;
	}
	
	/*A verificação de existência é feita comparando os nomes
	Se tenho um produto de nome <SUMO SANTAL 5L> ao comparar com um outro produto
	Com o mesmo nome significa que já existe
	Ele pega o nome pré-existente e o que quer adicionar/remover
	 * Como o método funciona?
	 */
	public boolean existe(String nome, Vector lista) {
		//Retira qualquer espaços que possa ter no nome
		nome=nome.replace(" ", "");
		for (int i = 0; i < lista.size(); i++) {
			//Porcura por strings com o mesmo nome, ignorando a capitalização
			if ((((Produto) lista.get(i)).getNome().replace(" ", "")).equalsIgnoreCase(nome) ) {
				System.out.println("JÁ FOI INSERIDO");
				//Se encontrar retorna o booleano verdade
				return true;
			}
		}
		return false;
	}
	
	public int procurarNome(String nome, Vector lista) {
		nome=nome.replace(" ", "");
		for (int i = 0; i < lista.size(); i++) {
			//Porcura por strings com o mesmo nome, ignorando a capitalização
			if ((((Produto) lista.get(i)).getNome().replace(" ", "")).equalsIgnoreCase(nome) ) {
				return i;
			}
		}
		return -1;
	}
	
	public Vector aumentarQtd(Vector lista, int id, int qtd) {
		//Este método simplesmente aumenta a quantidade de um produto por 1 ou mais no Stock
		for (int i = 0; i <lista.size(); i++) {
			if( ((Produto)lista.get(i)).getId()==id) {
				((Produto)lista.get(i)).setQtd(((Produto)lista.get(i)).getQtd()+qtd);
				return lista;
			}
		}
		
		return lista;
	}
	
	public int procurarCodigo(Vector lista,int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if( ((Produto)lista.get(i)).getId() ==codigo) {
				return i;
			}
		}
		return -1;
	}

	//Este método diminui a quantidade de um produto por 



}
