package exercicio2;

import java.util.Scanner;

public class SomaDigitos {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite um número");
		int numero = ler.nextInt();
		System.out.println(somadigitos(numero));
	}

	public static int somadigitos(int n) {
		int soma = 0;
		while (n != 0) {
			int resto = n % 10;
			n = n / 10;
			if (resto != 0) {
				soma = soma + resto;
			}
		}
		return soma;
	}

}
