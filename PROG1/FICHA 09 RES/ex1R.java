import java.util.Scanner;
public class ex1R{
	public static int v[];
	public static void main(String[] args){
		System.out.println("Deseja ver que nr da sequencia: ");
		int n=new Scanner(System.in).nextInt();
		v=new int[n+1];
		
		for(int i=0;i<n;i++){
		System.out.print(gerar(i)+" ");
		}
	}
	
	public static int gerar(int n){
		int recebe=0;
		
		if(n<5){
			recebe=1;
			return recebe;
		}
		if(v[n]!=0){
			return v[n];
		}	
		recebe=gerar(n-1)+2;
			v[n]=recebe;
		return recebe;
	}
}