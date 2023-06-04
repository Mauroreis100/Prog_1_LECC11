package exercicio3;

import java.util.Scanner;

public class FuncionarioSlaraio {
	public static void main(String[] args) {
		executa();
	}

	public static void executa() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Nome >");
		String nome = ler.next();
		System.out.println("Salario >");
		double salario = ler.nextDouble();
		System.out.println("O salario actual do(a) " + nome + " e " + salario);
		System.out.println("Quanto sera o aumneto do novo salario em %?");
		double aumento = ler.nextDouble();
		double novoSal = salario + (salario * (aumento / 100));
		System.out.println("O Funcionario " + nome + ", cujo salario era " + salario + ", passa a receber" + novoSal
				+ ", apos ter sofrido um aumento de " + aumento + "%");
	}
}
