import java.util.Scanner;
public class MaiorTres {
public static int Maior(int n, int m, int o) {
	int k[]= {n,m,o};
	int maior=k[0];
	for(int i=k.length-1;i>=0;i--) {
		if(k[i]>maior) {
			maior=k[i];
		}
	}
	return maior;
}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 números");
		int n = ler.nextInt();
		int v = ler.nextInt();
		int c=ler.nextInt();
		System.out.println("O maior número é "+Maior(n,v,c));

	}

}
