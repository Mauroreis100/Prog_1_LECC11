package cliente;

import java.util.*;
import cliente.Cliente;
import vendas.Vendas;
import Produto.Produto;

public class OperacoesCliente_Manuel {

	//Verificar existencia do cliente
	public boolean verificarExistenciaCliente(Cliente cliente,Vector clientes,int codigoIdentificacao) {
		for(int i=0;i<clientes.size();i++) {
			if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
				return true;
			}
		}
		return false;
	}
	
	//Registrar um novo cliente - Create
	public void registrarCliente(Cliente cliente,Vector clientes,Calendar data_criacao) {
		if(verificarExistenciaCliente(cliente, clientes, 0)==true) {
			clientes.add(cliente);
			data_criacao.getTime();
			System.out.println("Cliente adicionado com sucesso!");
		}else {
			System.out.println("Cliente existente!");
		}
	}
	
	//Editar algum dado do cliente - Update
		public void editarDadoCliente(Cliente cliente,Vector clientes,int codigoIdentificacao) {
			if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
				for(int i=0;i<clientes.size();i++) {
					if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
						Scanner input = new Scanner (System.in);
						System.out.println("***Menu de Edição de Dados do Cliente***");
						System.out.println("1-Nome do Cliente \n2-Código de Identificação \n3-Número de telefone \n4-Sair");
						int escolha=input.nextInt();
						
						while(escolha!=4) {
							switch(escolha) {
							case 1:
								System.out.println("Insira o nome do cliente:");
								String nome=input.nextLine();
								cliente.setNomeCliente(nome);
								System.out.println("Nome atualizado para: "+cliente.getNomeCliente());
								break;
							case 2:
								System.out.println("Insira o novo código de identificação para o cliente:");
								int codigo=input.nextInt();
								cliente.setCodigoIdentificacao(codigo);
								System.out.println("Código de identificação atualizado para: "+cliente.getCodigoIdentificacao());
								break;
							case 3:
								System.out.println("Insira o novo número de telefone do cliente:");
								int telefone=input.nextInt();
								cliente.setTelefone(telefone);
								System.out.println("Telefone atualizado para: "+cliente.getTelefone());
								break;
							case 4:
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
				System.out.println("Cliente não encontrado!");
			}
		}
	
		// Pesquisar cliente pelo código
		public Object pesquisarCliente(Cliente cliente,Vector clientes, int codigoIdentificacao) {
			Cliente client=null;
			for(int i=0;i<clientes.size();i++) {
				if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
					cliente=(Cliente)clientes.get(i);
				}
			}
			return client;
		}
		
	// Adicionando cada compra ao vector deste Cliente
		public boolean adicionarCompra(Cliente cliente,Vector clientes, int codigoIdentificacao, Vendas compra) {
			for (int i = 0; i < clientes.size(); i++) {
				if ((((Cliente) clientes.get(i)).getCodigoIdentificacao())==codigoIdentificacao) {
					((Cliente) clientes.get(i)).getCompras().add(compra);
					return true;
				}
			}
			return false;
		}
	
	//Verificar as compras feitas pelo cliente
	public void verComprasFeitas(Cliente cliente,int codigoIdentificacao,Vector compras,Vector clientes) {
		if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
			for(int i=0;i<compras.size();i++) {
				if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
					Cliente client=(Cliente)clientes.get(i);
					System.out.println(client.getCompras());
					//or
					System.out.println(client.getCompras().toString());
					break;
				}
			}
		}
	}
	
	//Ver conta corrente do Cliente (Tudo que o cliente já comprou em produtos)
	public void verContaCorrente(Cliente cliente,Vector clientes, int codigoIdentificacao,Vector compras,Vector carrinho) {
		Scanner input = new Scanner(System.in);
		Cliente client;
		double valorTotal=0;
		System.out.println("Insira o código de identificação do cliente:");
		int codigo=input.nextInt();
		if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
			for(int i=0;i<clientes.size();i++) {
				if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
					client=(Cliente)clientes.get(i);
					for(int j=0;j<client.getCarrinho().size();j++) {
						valorTotal+=((Produto) client.getCarrinho().get(j)).getPreco();//Problemas com cast
					}
				}
			}
		}else {
			System.out.println("Cliente não encontrado!");
		}
		System.out.println(valorTotal+" meticais.");
		
	}
	
	//Adicionar produto ao carrinho do cliente
	public boolean adicionarProdutoCarrinho(Cliente cliente,Produto produto,int codigoIdentificacao,Vector carrinho,Vector clientes) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o código de identificação do cliente:");
		int codigo=input.nextInt();
		
		if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
			carrinho.add(produto);
			return true;
		}
		return false;
	}
		
	//Remover produto do carrinho do cliente
		public boolean removerProdutoCarrinho(Cliente cliente,Produto produto,int codigoIdentificacao,Vector carrinho,Vector clientes) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Insira o código de identificação do cliente:");
			int codigo=input.nextInt();
			
			if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
				carrinho.remove(produto);
				return true;
			}
			return false;
		}
	
	// Apagar cliente pelo código - Delete
		public void apagarCliente(Cliente cliente,Vector clientes, int codigoIdentificacao) {
			if(verificarExistenciaCliente(cliente,null,codigoIdentificacao)==true) {
				for(int i=0;i<clientes.size();i++) {
					if(((Cliente)clientes.get(i)).getCodigoIdentificacao()==codigoIdentificacao) {
						clientes.remove(cliente);
					}
				}	
			}
		}
}
