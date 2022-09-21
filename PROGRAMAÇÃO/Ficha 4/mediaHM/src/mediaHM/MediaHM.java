package mediaHM;

import java.util.Scanner;

public class MediaHM {
	/*
	 * 8. Calcule a idade média de homens mulheres e todo um grupo de n estudantes.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeH, idadeM, idadeT;

		char resp = 's';
		double mediaH, mediaM, mediaT;
		idadeH = 0;
		idadeM = 0;
		idadeT = 0;
		mediaH = 0;
		mediaM = 0;
		mediaT = 0;
		int contM = 0, contH = 0;
		int somH = 0, somM = 0;

		while (resp == 's') {
			System.out.println("Insira idade da mulher. Caso não tenha insira 0");
			idadeM = ler.nextInt();
			if (idadeM != 0) {
				somM += idadeM;
				contM++;
			}

			System.out.println("Insira idade do homem. Caso não tenha insira 0");
			idadeH = ler.nextInt();

			if (idadeH != 0) {
				somH += idadeH;
				contH++;
			}

			System.out.println("Tem mais dados por inserir?[s/n]");
			resp = ler.next().charAt(0);
		}

		idadeT = contH + contM;

		mediaH = somH / contH;

		mediaM = somM / contM;

		mediaT = (somH + somM) / (idadeT);

		System.out.println("Idade media homens " + mediaH);
		System.out.println("Idade media mulhes " + mediaM);
		System.out.println("Idade media do grupo " + mediaT);

	}
}
