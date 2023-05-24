package operacoes;
import java.util.Vector;

import interfaces.Operacoes;
import objectos.Produto;
public class OperacoesImplementacao implements Operacoes{
	//Registrar um novo produto no estoque.
	public boolean registrarProd(Vector estoque, Produto prod) {
		return estoque.add(prod);
	}
//Consultar a quantidade disponível de um produto pelo seu código de identificação.
	public String QtdDisponivel(Vector estoque,int cod) {
		for (int i = 0; i < estoque.size(); i++) {
			if(((Produto)estoque.get(i)).getId()==cod) {
				return "A quantidade do Produto com código"+cod+" é: "+((Produto)estoque.get(i)).getQtd();
			}
		}
		return "Produto com códido "+cod+" não encontrado";
	}
	//LISTAR TESTE CLASS
		public void listarEstoque(Vector estoque) {
			for (int i = 0; i < estoque.size(); i++) {
				System.out.println(((Produto)estoque.get(i)).toString());				
			}
		}
		
		//Atualizar o preço de um produto pelo seu código de identificação.
		public String actualizarPreco(Vector estoque,int cod, double precoNovo) {
			for (int i = 0; i < estoque.size(); i++) {
				if(((Produto)estoque.get(i)).getId()==cod) {
					
					((Produto)estoque.get(i)).setPreco(precoNovo);
					return "Preço do Produto"+cod+" actualizado com sucesso";
				}
			}
			return "Produto com códido "+cod+" não encontrado";
		}
		//Remover um produto do estoque pelo seu código de identificação.
		public boolean removerProduto(Vector estoque,int cod) {
			for (int i = 0; i < estoque.size(); i++) {
				if(((Produto)estoque.get(i)).getId()==cod) {
					estoque.removeElementAt(i);
					System.out.println("Removido com sucesso");
					return true;
					
					}
			}
			System.out.println("Produdo do código "+cod+" não encontrado");
			return false;
		//	return "Produto com códido "+cod+" não encontrado";
		}
		
		
}
