package contaloja;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String mensagem = "\n---------------MATOLA SUPERMASRKET------------------------\n1. FAZER COMPRAS\n2. LEVANTAR\n3.DEPOSITAR\n4. VER SALDO\n5. NÚMERO TOTAL DE VENDAS REALIZADAS\n0. SAIR\n->";
		//System.out.print(mensagem);
		//int n = ler.nextInt();
		int n;
		char conta;
		Conta bim = new ContaPoupanca("Mauro Mahasa", 3000);//Instanciação com saldo especificado não funciona
		Conta bci = new ContaCorrente("Tony Stark", 7000);
		Vector<Loja> v = new Vector<Loja>();
		Loja shop1 = new Loja("Bannas", 30);
		do {
			System.out.print(mensagem);
			n = ler.nextInt();
			switch (n) {
			case 0:
				System.out.println("SAINDO...");
				break;
			case 1:
				System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\nQue conta preptende usar para efectuar a compra??\nP - CONTA POUPANÇA\nC - CONTA CORRENTE");
				conta = ler.next().charAt(0);
				v.add(shop1);
				
				if (conta == 'P' || conta == 'p') {
					bim.sacar(shop1.getPreco());
				}
				if (conta == 'C' || conta == 'c') {
					bci.sacar(shop1.getPreco());
				}
				break;
			case 2:
				System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\nQue conta preptende levantar?\nP - CONTA POUPANÇA\nC - CONTA CORRENTE");
				conta = ler.next().charAt(0);
				if (conta == 'P' || conta == 'p') {
					System.out.println("Quanto pretende levantar?");
					bim.sacar(ler.nextDouble());
				}
				if (conta == 'C' || conta == 'c') {
					System.out.println("Quanto pretende levantar?");
					bci.sacar(ler.nextDouble());
				}
				break;
			case 3:
				System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\nEm que conta preptende depositar?\nP - CONTA POUPANÇA\nC - CONTA CORRENTE");
				conta = ler.next().charAt(0);
				if (conta == 'P' || conta == 'p') {
					System.out.println("Quanto pretende depositar?");
					bim.depositar(ler.nextDouble());
				}
				if (conta == 'C' || conta == 'c') {
					System.out.println("Quanto pretende depositar?");
					bci.depositar(ler.nextDouble());
				}
				break;
			case 4:
				System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\nConta Corrente: " + bci.saldo() + "\nConta Poupança: " + bim.saldo());
				break;
			case 5:
			System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\n"+v.size()+" VENDAS");
				break;
			default:
				System.out.println("\n---------------MATOLA SUPERMASRKET------------------------\nOPÇÃO INVÁLIDA! TENDE DENOVO");
				break;
			}

		} while (n!=0);

	}
}
