package main;

import produto.Produto;
import produto.Stock;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import carrinho.*;
import cliente.*;

public class Main {

	public static void main(String[] args) {
		
		
		// Instância Vector dos Clientes (Eventualmente deve recuperar do ficheiro de
		// texto)
		Vector clientes = new Vector();

		// Instância Vector dos Produtos no Carrinho. Não recupera nada. guarda tudo na
		// mémoria temporária
		Vector carrinho = new Vector();

		// Instância Vector dos Produtos no Stock. (Eventualmente deve recuperar do
		// ficheiro de texto)
		Vector stock = new Vector();

		// Instância de Operações do Vector Clientes
		OperecoesCliente opCliente = new OperecoesCliente();

		// Instância de Operações do Vector Clientes
		OperacoesCarrinho operacoesCart = new OperacoesCarrinho();

		// Instância de Operações do Stock
		Stock armazem = new Stock();

		//Instância de operações comuns
		OperacoesVitais opVitais=new OperacoesVitais();
		
		
		Scanner ler = new Scanner(System.in);
		
		Random aleatorio = new Random();

		int operacao;
		int id;//Usando variavel id para todos requisitos
		do {// OPERAÇÕES PRINCIPAL E TELA DE BEM-VINDO
			System.out.println(
					"BEM VINDO A LOJA XXXXXX\n SELECCIONE A SUA OPÇÃO\n1.Comprar\n2. Mais Opções(Cliente/Produto/Vendas)\n0. SAIR\n>>>");
			operacao = ler.nextInt();
			int procuraID=-1;
			int procuraCodigo=-1;
			switch (operacao) {
			case 1:
				System.out.println("\nIDENTIFIQUE-SE USANDO O CÓDIGO LECC");
				//int identificacao=ler.nextInt();
				int codeLECC=ler.nextInt();
				 procuraCodigo=opCliente.procuraID(clientes, codeLECC);
				 if(procuraCodigo!=-1) {					
						int opcoesCarrinho;
						do {
							System.out.println("CARRINHO\n1. Adicionar produto no carrinho\n2. Remover Produto do carrinho\n3. Ver produtos no carrinho\n\n4. Ver produtos disponíveis\n5. Finalizar Compra\n0. CANCELAR\n>>>");
							opcoesCarrinho=ler.nextInt();
							Carrinho cart=new Carrinho(carrinho);
							switch(opcoesCarrinho) {
							case 1:
								//Instancia do carrinho cheio de produtos
								System.out.println("Qual é o código do produto que pretende adicionar no carrinho?");
								int codProd=ler.nextInt();
								if(armazem.procurarCodigo(stock, codProd)!=-1) {
									Produto encontrado=(Produto)stock.get(armazem.procurarCodigo(stock, codProd));
									System.out.println("E qual é a quantidade de "+((Produto)stock.get(armazem.procurarCodigo(stock, codProd))).getNome()+" que pretende adicionar ao carrinho?");
									int quantidade=ler.nextInt();
									operacoesCart.adicionarProduto(encontrado, cart,quantidade);
								}
								
								break;
							case 3:
								System.out.println("ITENS DO CARRINHO");
								operacoesCart.listarItensCarrinho(cart);
								break;
							}
						}while(opcoesCarrinho!=0);
					}
				
				int escolha=ler.nextInt();
				
					
				
				
				
				
				
//				switch(escolha){
//				case 1:
//					System.out.println("Para efectuar a compra, insira o seu BI:");
//					String bi=ler.next();
//					//EXISTE ESTE CLIENTE? USANDO BI
//					
//					if(true || true) {
//						
//					
//						
//					
//					
//						
//					}
//					
//					break;
//				case 2:
//					System.out.println("Para efectuar a compra, insira o seu código LECC:");
//					int codigoLECC=ler.nextInt();
//					//EXISTE ESTE CLIENTE? USANDO O CÓDIGO LECC?
//					break;
//				}
//				break;
			case 2:
				int opcoes;

				do {// OPERAÇÕES MAIS OPERAÇÕES
					System.out.println("-----\tOPÇÕES\t-----");
					System.out.println("MENU\n1. Clientes\n2. Produtos\n3. Vendas\n0. Sair\n>>>");
					opcoes = ler.nextInt();
					switch (opcoes) {
					case 1:
						int opcaoCliente;
						do {// OPERAÇÕES DOS CLIENTES
							System.out.println(
									"1.OPERAÇÕES CLIENTE\n1. Criar Cliente\n2. Actualizar Cliente\n3. Remover Cliente\n4. Pesquisar Cliente\n5. Ver conta Correne do Cliente\n0. SAIR E SALVAR ALTERAÇÕES\n>>>");
							opcaoCliente = ler.nextInt();
							switch (opcaoCliente) {
							case 1:
								// 1-INSERIR CLIENTE
								Vector compras = new Vector();
								Carrinho vazio=new Carrinho();
								int codigo = 3;
								System.out.println("BI DO CLIENTE:");
								String bi = ler.next();
								System.out.println("Nome do Cliente:");
								String nome = ler.next();
								Cliente cl = new Cliente(codigo, bi, nome, vazio);
								opCliente.adicionarCliente(clientes, cl);
								break;
							case 2:
								// 2 - Actualizar dados do Cliente

								break;
							case 3:
								// 3 - Remover Cliente
								break;
							case 4:
								// Pesquisar Cliente
								break;
							case 5:
								// Ver conta corrente do Cliente (Tudo que já comprou em valores)
								break;
							default:
								break;
							}
						} while (opcaoCliente != 0);// FIM DAS OPERAÇÕES DO CLIENTE

						break;// BREAK PARA OPERAÇÕES DO CLIENTE

					case 2:// OPERAÇÕES PARA OS PRODUTOS
						int opcaoProduto;
						do {
							System.out.println(
									"OPERAÇÕES PRODUTO\n1. Encomendar produto\n2. Actualizar Produto\n3. Remover Produto\n4. Pesquisar Produto\n5. Emitir Relatórios do Stock\n6. Ver todos os produtos\n0. SAIR E SALVAR ALTERAÇÕES\n>>>");
							opcaoProduto = ler.nextInt();
							switch (opcaoProduto) {
							case 1:
								// Adicionar produtos no Stock
								int codigo = stock.capacity();
								System.out.println("Quantidade da encomenda: ");
								int qtd = ler.nextInt();
								ler.nextLine();
								
								System.out.println("Nome do produto que pretende encomendar: ");
								String nomeProduto=ler.nextLine();
							
								System.out.println("Preço do produto: ");
								
								Produto prod = new Produto(codigo, nomeProduto, qtd);
								armazem.adicionarNovoProduto(stock, prod);
								break;
							case 2:
								// 2 - Actualizar dados do Produto
								System.out.println("ID do produto que pretende actualizar:");
								id = ler.nextInt();
								armazem.editarDadoProduto(stock,id);
								break;
							case 3:
								// 3 - Remover Produto
								System.out.println("ID do produto que pretende remover:");
								id = ler.nextInt();
								armazem.removerProduto(stock,id);
								break;
							case 4:
								// Pesquisar Produto
								System.out.println("ID do produto que pretende pesquisar: ");
								id = ler.nextInt();
								int indice=armazem.procurarCodigo(stock, id);
								if(indice!=0) {
									System.out.println(((Produto)stock.get(indice)).toString());
								}else {
								 System.out.println("Produto inexistente");
								}
								
								break;
							case 5:
								// Emitir Relatórios do Stock (produtos abaixo de 5 unidades e produtos mais
								// vendidos)
								System.out.println("PRODUTOS ABAIXO DE 5 UNIDADES! RESTOCK!!");
								armazem.abaixoDe5(stock);

								System.out.println("Listagem de quantos produtos mais vendidos?");
								int quantos=ler.nextInt();
								armazem.maisVendidos(stock,quantos);

								break;
							case 6:
								break;
							default:
								System.out.println("OPÇÃO INVÁLIDA! TENTE DE NOVO");
								break;
							}
						} while (opcaoProduto != 0);// FIM DA OPERAÇÕES DE PRODUTOS

						break;
					case 3:
						// LISTAR PRODUTOS?

						break;
					}
				} while (opcoes != 0);
				break;
			case 0:

				System.out.println("VOLTE SEMPRE");
				break;
			}

		} while (operacao != 0);// FIM DA TELA PRINCIPAL

		/*
		 * Vector itens=new Vector();
		 * 
		 * 
		 * Carrinho cart=new Carrinho("ID \\t DESCRIÇÃO \\t QTD \\t TOTAL",itens);
		 * Produto prod=new Produto(123,"Vaselina".toUpperCase()); //itens.add(prod);
		 * //ADICIONAR SÓ operacoesCart.adicionarProduto(prod, cart); prod=new
		 * Produto(1234,"MENS TRACKSUIT"); operacoesCart.adicionarProduto(prod, cart);
		 * prod=new Produto(341,"Blanket".toUpperCase());
		 * operacoesCart.adicionarProduto(prod, cart);
		 * //System.out.println("REMOVE 341\n\n"+operacoesCart.adicionarProduto(prod,
		 * cart).toString()+"\n\n");
		 * 
		 * //Especificar QUANTIDADE DOS itens QUE QUER ADICIONAR for (int i = 0; i <
		 * cart.getProdutos().size(); i++) {
		 * System.out.println(cart.getProdutos().get(i));
		 * 
		 * } System.out.println("\nREMOVE 341\n\n"); operacoesCart.removerProduto(341,
		 * prod, cart); for (int i = 0; i < cart.getProdutos().size(); i++) {
		 * System.out.println(cart.getProdutos().get(i));
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //Carrinho cart=new Carrinho("ID \t DESCRIÇÃO \t QTD \t TOTAL",produtos);
		 * 
		 * 
		 * Cliente cl=new Cliente(123,"Mauro Mahassa",cart.getProdutos());
		 * System.out.println(cl.getCompras());
		 * 
		 * Produto produ=new Produto(111,"Telefone".toUpperCase());
		 * stock.adicionarNovoProduto(produtos, produ); produ=new
		 * Produto(132,"TeleFone".toUpperCase());
		 * 
		 * System.out.println(((Produto)stock.adicionarNovoProduto(produtos,
		 * produ).get(0)).getQtd());
		 */

	}

}
