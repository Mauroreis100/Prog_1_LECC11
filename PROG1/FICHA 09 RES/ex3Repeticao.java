import java.util.Scanner;
public class ex3Repeticao{
	public static void main(String[] args){
		System.out.println("insira o primeiro");
		int n=new Scanner(System.in).nextInt();
		int p=new Scanner(System.in).nextInt();
		System.out.print(ackerman(n,p)+" ");
	}

	//System.out.print(ackerman(i,n)+"");
	public static int ackerman(int n,int p){
		if(n==0 && p>0){
			return p+1;
		}else if(n>0 && p==0){
			return ackerman(n-1,1);
		}else if(n==0 && p>0){
	
			return ackerman(n-1,ackerman(n,p-1));
		}
	}
	
	
}