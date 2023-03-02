
import java.util.Scanner;

public class MetodoMaior {
public static int Maior(int n, int v) {
	int maior;
	if (n > v) {
		maior = n;

	} else {
		maior = v;

	}
	return maior;
}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 2 números");
		int n = ler.nextInt();
		int v = ler.nextInt();
		System.out.print("O maior número entre "+n+" e "+v+" é "+Maior(n,v));

	}

}
