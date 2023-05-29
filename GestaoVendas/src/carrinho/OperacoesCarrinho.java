package carrinho;
import java.util.Iterator;
import java.util.Vector;

import produto.Produto;

public class OperacoesCarrinho {
public Vector adicionarProduto(Produto prod, Carrinho cart, int quantidade) {
	int qtd=prod.getQtd();//Recebe a quantidade do produto que estou prestes a inserir
	//Se o produto que estou prestes a inserir já existe então muda a quantidade para +quantidade
	if(cart.getProdutos().contains(prod)) {
		cart.getProdutos().set(cart.getProdutos().indexOf(prod), prod.getQtd()+quantidade);
	}
	cart.getProdutos().add(prod);
	//Diminuir a quantidade, ao adicionar no carrinho deve diminuir taambém
	return cart.getProdutos();
}
public Vector removerProduto(int id,Carrinho cart) {
	for (int i = 0; i < cart.getProdutos().size(); i++) {
		//&& ((Produto)cart.getProdutos().get(i)).getQtd()
		if( ((Produto)cart.getProdutos().get(i)).getId()==id) {
			cart.getProdutos().remove(i);
			System.out.println("ECONTRAMOS");
			return cart.getProdutos();
		}
	}
	System.out.println("NÃO ECONTRAMOS");

	return cart.getProdutos();
}

public void listarItensCarrinho(Carrinho cart) {
for (int i = 0; i < cart.getProdutos().size(); i++) {
	System.out.println( 
			((Produto)cart.getProdutos().get(i)).getId()+" | "+ ((Produto)cart.getProdutos().get(i)).getNome()
			+ "|"+((Produto)cart.getProdutos().get(i)).getQtd()
			);
}
}

}
