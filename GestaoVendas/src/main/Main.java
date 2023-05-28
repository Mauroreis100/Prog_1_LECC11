package main;
import produto.Produto;

import java.util.Vector;

import carrinho.Carrinho;
import carrinho.OperacoesCarrinho;
import cliente.Cliente;
public class Main {

	public static void main(String[] args) {
		Vector clientes=new Vector();
		
		Vector produtos=new Vector();
		OperacoesCarrinho operacoesCart=new OperacoesCarrinho();
		
		Carrinho cart=new Carrinho("ID \\t DESCRIÇÃO \\t QTD \\t TOTAL",produtos);
		Produto prod=new Produto(123,"Vaselina");
		//produtos.add(prod);
		//ADICIONAR SÓ
		operacoesCart.adicionarProduto(prod, cart);
		prod=new Produto(1234,"MENS TRACKSUIT");
		operacoesCart.adicionarProduto(prod, cart);
		prod=new Produto(341,"Blanket");
		operacoesCart.adicionarProduto(prod, cart);
		//System.out.println("REMOVE 341\n\n"+operacoesCart.adicionarProduto(prod, cart).toString()+"\n\n");
		
		//Especificar QUANTIDADE DOS PRODUTOS QUE QUER ADICIONAR
		for (int i = 0; i < cart.getProdutos().size(); i++) {
			System.out.println(cart.getProdutos().get(i));
			
		}
		System.out.println("\nREMOVE 341\n\n");
		operacoesCart.removerProduto(341, prod, cart);
		for (int i = 0; i < cart.getProdutos().size(); i++) {
			System.out.println(cart.getProdutos().get(i));
			
		}
		
		
		
		//Carrinho cart=new Carrinho("ID \t DESCRIÇÃO \t QTD \t TOTAL",produtos);
		
		
		Cliente cl=new Cliente(123,"Mauro Mahassa",cart.getProdutos());
		System.out.println(cl.getCompras());
	
	}

}
