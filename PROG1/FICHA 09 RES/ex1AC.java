import java.util.Scanner;
public class ex1AC{
	
	public static void main(String[] args){
		System.out.println("Deseja ver que nr da sequencia: ");
		int n=new Scanner(System.in).nextInt();

		System.out.print(gerar(n)+" ");

	}
	
	public static int gerar(int n){
		if(n==1 || n==2){
			return n;
		}else if(n>2){
			return gerar(n+1);
		}	
	}
}

