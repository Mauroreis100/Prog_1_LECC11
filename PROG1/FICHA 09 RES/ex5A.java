import java.util.Scanner;
public class ex5A{
	public static int i=1;
	public static void main(String[] args){
		System.out.println("insira o limite da dos nrs: ");
		int n=new Scanner(System.in).nextInt();
		
		while(n==0){
			System.out.println("Insira um limite valido: ");
			n=new Scanner(System.in).nextInt();
		}
		
		gerarAteN(n);
	}
	
	public static void gerarAteN(int n){
		if (n>0){
			System.out.print(i+" ");
			i++;
			n--;
			gerarAteN(n);
		}
	}
}