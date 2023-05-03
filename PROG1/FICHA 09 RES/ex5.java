import java.util.Scanner;
public class ex5{
	public static void main(String[] args){
		System.out.println("insira o limite da dos nrs: ");
		int n=new Scanner(System.in).nextInt();
		
		while(n==0){
			System.out.println("Insira um limite valido: ");
			n=new Scanner(System.in).nextInt();
		}
		
		gerarAteN(1,n);
	}
	
	public static void gerarAteN(int i,int n){
		if (i<=n){
			System.out.print(i+" ");
			i++;
			gerarAteN(i,n);
		}
	}
}