package main;
import java.util.Scanner;
import java.util.Vector;

import objectos.Produto;
import operacoes.OperacoesImplementacao;
public class Main {

	public static void main(String[] args) {
		
		Vector stock=new Vector();
		Scanner ler=new Scanner(System.in);
		Produto prod;
		OperacoesImplementacao op=new OperacoesImplementacao();
		//Produtos inseridos previamente
		prod = new Produto(123,"Santal 300 ML",3,60);
		op.registrarProd(stock, prod);
		prod = new Produto(33,"Bebedor Tupperware",50,1570);
		op.registrarProd(stock, prod);
		prod = new Produto(442,"Mouse",70,250);
		op.registrarProd(stock, prod);
		prod = new Produto(99,"Bicicleta",3,2300);
		op.registrarProd(stock, prod);
		prod = new Produto(55,"Canetas x10",70,60);
		op.registrarProd(stock, prod);
		prod = new Produto(13,"Água",67,65);
		op.registrarProd(stock, prod);
		prod = new Produto(77,"PS4",20,12500);
		op.registrarProd(stock, prod);
		prod = new Produto(324,"Pratos 4x",31,100);
		op.registrarProd(stock, prod);
		prod = new Produto(53425,"Sabão Liquído",3,65);
		op.registrarProd(stock, prod);
		prod = new Produto(54325,"Detergente em pó",50,80);
		op.registrarProd(stock, prod);
		op.listarEstoque(stock);
		int opcao;
	
		do {
			
			System.out.println("\n\n\t--------Bem-Vindo ao Supermercado LECC--------\n0-Sair e Imprimir\n1-Adicionar (1111-Cadeira de escritorio)\n2-Consultar quantidade pelo código (33)"
					+ "\n3-Actualizar o preço pelo código de identificação(53425) para 6000mt\n"
					+ "4-Remover produto do estoque pelo código de identificação(77)");
			opcao=ler.nextInt();
			switch(opcao) {
			case 0:
				op.listarEstoque(stock);
				System.out.println("SAINDO...");
				break;
			case 1:
				prod = new Produto(1111,"Cadeira de escritorio",50,3000);
				boolean estado=op.registrarProd(stock, prod);
				
				if(estado) {
					System.out.println("Inserido com sucesso");
				}else {
					System.out.println("Erro na inserção");
				}
				break;
			case 2:
				//Consultar a quantidade disponível de um produto pelo seu código de identificação.
				System.out.println(op.QtdDisponivel(stock, 33));
				break;
			case 3:
				//Atualizar o preço de um produto pelo seu código de identificação.
				System.out.println(op.actualizarPreco(stock, 53425, 6000));
				
				break;
			case 4:
				op.removerProduto(stock, 77);
				break;
				
				default:
					System.out.println("Opção Inválida");
					break;
				
			}
		} while (opcao!=0);

	}

}
