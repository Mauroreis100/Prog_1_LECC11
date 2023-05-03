import java.util.Scanner;
public class ex1b{
	public static void main (String[]args){
		System.out.println("Deseja ver que nr: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println(gerar(n));
	}
	public static int gerar(int n){
		
		if(n==3){
			return 3;
		}	
		return gerar(n+1)=gerar(n)/4;

		
	}
}