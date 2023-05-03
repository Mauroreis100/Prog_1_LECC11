import java.util.Scanner;
public class ex3{
	public static void main(String[] args){
		System.out.println("insira o primeiro");
		int m=new Scanner(System.in).nextInt();
		int n=new Scanner(System.in).nextInt();
		System.out.print(ackerman(m,n)+" ");
	}

	//System.out.print(ackerman(i,n)+"");
	public static int ackerman(int m,int n){
		if(m==0){
			return ackerman(m+1,1);
		}else if(m>0 && n==0){
			return ackerman(m-1,1);
		}else if(m>0 && n>0){
	
			return ackerman(m-1,ackerman(m,n-1));
		}
	}
	
}