package soma1a9;

import java.util.Scanner;

public class Soma1a9 {

	public static void main(String[] args) {
		// Não foi especificado que tipo de número
		double n;
		double a;
		double soma;
		System.out.println("Escreva a soma de 2 numeros no intervalo de 1 a 9");
		Scanner ler = new Scanner(System.in);
		n = ler.nextDouble();
		a = ler.nextDouble();

		if (n >= 1 && n <= 9 && a >= 1 && a <= 9) {
			soma = a + n;
			System.out.println(soma);

		} else {
			System.out.println("Números de 1 a 9 apenas");
		}
	}

}
