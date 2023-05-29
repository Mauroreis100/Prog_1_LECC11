package produto;

import java.util.Iterator;
import java.util.Scanner;
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
		//prod.setQtd(prod.getQtd() + 1);
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
	public boolean removerProduto(Vector lista,int codigo){
		int index=procurarCodigo(lista,codigo);
		for (int i = 0; i < lista.size(); i++) {
			if(index!=-1) {
				lista.remove(index);
				System.out.println("Produto eliminado com sucesso");
				return true;
			}
		}
		System.out.println("Produto não encontrado");
		return false;
	}
	public void editarDadoProduto(Vector lista,int codigo) {
		if(procurarCodigo(lista,codigo)!=-1) {
			for(int i=0;i<lista.size();i++) {
				if(((Produto)lista.get(i)).getId()==codigo) {
					Scanner input = new Scanner (System.in);
					System.out.println("***Menu de Edição de Dados do Produto***");
					System.out.println("1-Nome do Produto \n2-Quantidade \n3-Sair");
					int escolha=input.nextInt();
					
					while(escolha!=3) {
						switch(escolha) {
						case 1:
							System.out.println("Insira o nome do Produto:");
							String nome=input.nextLine();
							((Produto)lista.get(i)).setNome(nome);
							System.out.println("Nome atualizado para: "+((Produto)lista.get(i)).getNome());
							break;
						case 2:
							System.out.println("Insira o novo código de identificação para o cliente:");
							int qtd=input.nextInt();
							((Produto)lista.get(i)).setQtd(qtd);
							System.out.println("Quantidade atualizada para: "+((Produto)lista.get(i)).getQtd());
							break;
						case 3:
							System.out.println("Saindo!");
							break;
						default:
							System.out.println("Opção Inválida!\nInsira novamente:");
							escolha=input.nextInt();
							break;
						}
					}
				}
			}
		}else {
			System.out.println("Produto não encontrado!");
		}
	}

	public void abaixoDe5(Vector lista) {
		for (int i = 0; i < lista.size(); i++) {
			if( ((Produto)lista.get(i)).getQtd()<5 ) {
				System.out.println("\nQuantidade pretendida não esta disponível, apenas tem 4\n"+((Produto)lista.get(i)).getNome()+((Produto)lista.get(i)).getQtd());
			}
		}
	}

	public void maisVendidos(Vector lista,int quantos) {
		for (int i = 1; i < lista.size()-1; i++) {
		    for (int j = 0; j < i-1; j++) {
		        if (((Produto)lista.get(i)).getVendas() > ((Produto)lista.get(j)).getVendas()) {
		           Produto troca=(Produto)lista.get(i);
		           lista.set(j, lista.get(j + 1));
	                lista.set(j + 1, troca);
		        }
		    }
		}
		System.out.println("Os produtos mais comprados são:");
		if(quantos<lista.size() || quantos>0) {
		for (int i = 0; i < quantos; i++) {
			System.out.println(((Produto)lista.get(i)).imprimiVendas());
		}
		}else {
			System.out.println("TENTE DENOVO, COM UM NÚMERO MENOR OU MAIOR");
		}
	}
	//Este método diminui a quantidade de um produto por 



}
