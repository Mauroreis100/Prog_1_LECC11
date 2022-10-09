import java.util.Scanner;

public class NumeroDecrescente {
	public static void Decrescente(int n) {
		for(int i=n;i!=-1;i--) {
	System.out.print(i+",");
			}
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 número");
		int v = ler.nextInt();
		Decrescente(v);

	}

}
