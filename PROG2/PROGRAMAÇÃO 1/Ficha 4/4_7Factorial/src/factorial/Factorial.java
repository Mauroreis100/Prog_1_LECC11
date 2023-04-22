package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Pretende calcular o factorial de que nr?");
		int n = ler.nextInt();
		int i, fact = 1, j = n;
		double a;
		if (n < 0) {
			System.out.print("Invalido");
		} else {
			if (n == 0) {
				System.out.println(fact);
			} else {
				while (n > 0) {
					fact = fact * n;
					n--;
				}
				System.out.println("O factorial de " + j + " é " + fact);
			}
		}
	}

}
