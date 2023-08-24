package main;

import java.lang.*;

public class Casting {
	public static void main(String args[]) {
		// int numeroInteiro;
		// numeroInteiro=(int)2.6; -> CASTING EXPLICITO
		// System.out.println(numeroInteiro);
		// long numeroLongo;
		// numeroLongo=(int)5;//nESTE TIPO DE CASTING. Por não haver perda de bits há um
		// casting implitcito
		// System.out.println(numeroLongo);

		try {
			int[] numeros = new int[-4];
			numeros[0] = 10;
			numeros[1] = 20;
			numeros[2] = 30;
			numeros[3] = 40;
			numeros[4] = 50;
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		} catch (NegativeArraySizeException n) {
			System.out.println(n.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {

		}

	}
}