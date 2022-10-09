import java.util.Scanner;

public class QuadradoAsterix {
	public static void Maior(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 número");
		int v = ler.nextInt();
		Maior(v);

	}

}
