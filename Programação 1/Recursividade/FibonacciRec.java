import java.util.Scanner;
public class FibonacciRec {
	public static long fibonacci(int n) {
		if(n==0){
			return 0;	
		}else if(n==1||n==2){
			return 1; 
		} else{ 
			return (fibonacci(n-1)+ fibonacci(n-2));
		}
	}
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual posicao deseja:");
		int n=entrada.nextInt();
		System.out.println(FibonacciRec.fibonacci(n));
	}
}