package main;
import produto.Produto;
import produto.Stock;

import java.util.Scanner;
import java.util.Vector;

import carrinho.*;
import cliente.*;
public class Main {

	public static void main(String[] args) {
		//Instância Vector dos Clientes (Eventualmente deve recuperar do ficheiro de texto)
		Vector clientes=new Vector();
		
		//Instância Vector dos Produtos no Carrinho. Não recupera nada. guarda tudo na mémoria temporária
		Vector carrinho=new Vector();
				
		//Instância Vector dos Produtos no Stock. (Eventualmente deve recuperar do ficheiro de texto)
		Vector stock=new Vector();
		
		//Instância de Operações do Vector Clientes
		OperecoesCliente opCliente=new OperecoesCliente();
		
		//Instância de Operações do Vector Clientes
		OperacoesCarrinho operacoesCart=new OperacoesCarrinho();
		
		//Instância de Operações do Stock
		Stock armazem=new Stock();
		
				
		Scanner ler=new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("ESCOLHA");
			opcao=ler.nextInt();
			switch(opcao) {
			case 1:
				//1-INSERIR CLIENTE
				Vector compras=new Vector();
				int codigo=ler.nextInt();
				String nome=ler.next();
				Cliente cl=new Cliente(codigo,nome,compras);
				opCliente.adicionarCliente(clientes, cl);
				break;
			case 2:
				//Adicionar produtos no Stock
				System.out.println("ID,NOMEPROD");
				Produto prod=new Produto(ler.nextInt(),ler.next());
				armazem.adicionarNovoProduto(stock, prod);
				break;
			
			case 3:
				//LISTAR PRODUTOS?
			break;
			}
		}while(opcao!=0);
		/*
		Vector itens=new Vector();
		
		
		Carrinho cart=new Carrinho("ID \\t DESCRIÇÃO \\t QTD \\t TOTAL",itens);
		Produto prod=new Produto(123,"Vaselina".toUpperCase());
		//itens.add(prod);
		//ADICIONAR SÓ
		operacoesCart.adicionarProduto(prod, cart);
		prod=new Produto(1234,"MENS TRACKSUIT");
		operacoesCart.adicionarProduto(prod, cart);
		prod=new Produto(341,"Blanket".toUpperCase());
		operacoesCart.adicionarProduto(prod, cart);
		//System.out.println("REMOVE 341\n\n"+operacoesCart.adicionarProduto(prod, cart).toString()+"\n\n");
		
		//Especificar QUANTIDADE DOS itens QUE QUER ADICIONAR
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
		
		Produto produ=new Produto(111,"Telefone".toUpperCase());
		stock.adicionarNovoProduto(produtos, produ);
		produ=new Produto(132,"TeleFone".toUpperCase());
		
		System.out.println(((Produto)stock.adicionarNovoProduto(produtos, produ).get(0)).getQtd());*/
	
	}

}
