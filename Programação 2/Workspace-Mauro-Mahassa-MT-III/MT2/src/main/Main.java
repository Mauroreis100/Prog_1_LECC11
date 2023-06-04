package main;

import funcionario.Funcionario;
import funcionarios.*;
import relatorio.Empresa;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Funcionario designer = new Designer(22, 3);
		Funcionario gerente = new Gerente(22, 3);
		Funcionario desenvolvedor = new Desenvolvedor(22, 3);

		Empresa emp = new Empresa();
		
		//emp.add(desenvolvedor);
		//emp.impressaoTotal();
		int opcao;
		int adicionar;
		System.out.println("Qual é o tamanho da empresa?");
		emp.setTamanho(ler.nextInt());
		int tamanho=emp.getTamanho();

		do {
			System.out.print(
					"0 - SAIR\n1 - ADICIONAR FUNCIONÁRIO\n2 - IMPRIMIR SALÁRIO TOTAL DE TODOS OS FUNCIONÁRIOS\n>>>");
			opcao = ler.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("SAINDO DO PROGRAMA");
				break;
			case 1:
				do {
					
					System.out.print("\nFALTAM "+tamanho+" ESPAÇOS PARA SEREM COMPLETADOS\nQue Funcionario pretende adicionar?" + ""
							+ "\n----------\n0. VOLTAR\n1.GERENTE\n2. DESIGNER\n3. DESENVOLVEDOR\n->>");
					adicionar = ler.nextInt();
					switch (adicionar) {
					case 0:
						break;
					case 1:
						emp.add(gerente);
						tamanho--;
						break;
					case 2:
						emp.add(designer);
						tamanho--;
						break;
					case 3:
						emp.add(desenvolvedor);
						tamanho--;
						break;
					default:
						System.out.println("Opção Inválida!");
						break;
					}
				} while (adicionar != 0);
				
				break;
			case 2:{
				emp.impressaoTotal();
			}break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		} while (opcao != 0);
		//System.out.println(emp.getF()[1].salario());
	}

}
