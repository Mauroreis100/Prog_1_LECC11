package carrinho;
import java.util.Vector;

import produto.Produto;

public class OperacoesCarrinho {
public Vector adicionarProduto(Produto prod, Carrinho cart) {
	int qtd=prod.getQtd();
	if(cart.getProdutos().contains(prod)) {
		cart.getProdutos().set(cart.getProdutos().indexOf(prod), prod.getQtd()-1);
	}
	cart.getProdutos().add(prod);
	//Diminuir a quantidade, ao adicionar no carrinho deve diminuir taambém
	return cart.getProdutos();
}
public Vector removerProduto(int id, Produto prod,Carrinho cart) {
	for (int i = 0; i < cart.getProdutos().size(); i++) {
		//&& ((Produto)cart.getProdutos().get(i)).getQtd()
		if( ((Produto)cart.getProdutos().get(i)).getId()==id) {
			cart.getProdutos().remove(i);
			System.out.println("ECONTRAMOS");
			return cart.getProdutos();
		}
	}
	System.out.println("não ECONTRAMOS");

	return cart.getProdutos();
}


}
