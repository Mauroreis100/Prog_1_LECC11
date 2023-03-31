import java.util.Scanner;
public class Ex17{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	int i=1;
	System.out.println("Insira um nr");
	int n=ler.nextInt();
	
		if (n>0){
			while (i<=n){
				System.out.print(i+" ");
				i++;	
				
			}		
		}else{
			System.out.println("Insira um nr positivo");
		}	
	}
}