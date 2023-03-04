package exercicio1;

import java.util.Scanner;

public class Media {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(executa());
	}

	public static double executa() {
		char mais1 = '+';
		int i = 0;
		double soma = 0, media, a;
		do {
			System.out.println("Numero: ");
			a = ler.nextInt();
			soma = soma + a;
			i++;
			System.out.println("Pretende continuar? Digite + caso nao coloque insira um caracter diferente");
			mais1 = ler.next().charAt(0);
		} while (mais1 == '+');

		return media = soma / i;
	}
}
