package umAteN;

import java.util.Scanner;


public class umAteN {
	public static void main(String args[]) {
		System.out.println("Insira um número");
		Scanner ler =new Scanner(System.in);
		int n=ler.nextInt();
		int some=0;
		for(int i=1; i<=n; i++) {
			some+=+i;
		}
		System.out.println(some+"");
	}

}
