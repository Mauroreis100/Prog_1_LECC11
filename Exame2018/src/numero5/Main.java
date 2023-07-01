package numero5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Id:");
		int id = ler.nextInt();
		System.out.print("Nome:");
		String nome = ler.next();
		ler.nextLine();
		System.out.println("Idade:");
		int idade = ler.nextInt();
		System.out.println("Altura:");
		float altura = ler.nextFloat();
		ComportamentosPessoa pessoa = new ComportamentosPessoa(id, nome, idade, altura);
		pessoa.adicionaPessoa(id, nome, idade, altura);
		pessoa.adicionaPessoa(id, nome, idade, altura);
		System.out.println(pessoa.relatorio().toString());
	}

}
