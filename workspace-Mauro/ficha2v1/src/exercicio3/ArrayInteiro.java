package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ArrayInteiro {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		dividirNumero();
	}

	public static void dividirNumero() {
		System.out.println("Insira um número ao Array:");
		int n = ler.nextInt();
		char mais = 's';
		int j = 0;

		ArrayList<Integer> Nrs = new ArrayList<>();
		Nrs.add(n);

		while (mais == 's' || mais == 'S') {
			if (j != 0) {
				System.out.println("Adicione mais um número ao Array");
				int d = ler.nextInt();
				Nrs.add(d);
			}

			System.out.println("Números no Array");
			for (int i = Nrs.size() - 1; i >= 0; i--) {
				System.out.print(Nrs.get(i) + " | ");
			}
			System.out.println();
			System.out.println("Pretende adicionar mais um número ao Array? \n S ou N?");
			mais = ler.next().charAt(0);
			j++;
		}
		Collections.sort(Nrs);
		  int segundoMaior = Nrs.size();
	       System.out.println(Nrs.get(segundoMaior - 2)); 
	}
}