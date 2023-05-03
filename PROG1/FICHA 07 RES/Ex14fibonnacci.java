import java.util.Arrays;
public class Ex14fibonnacci {
	public static void main(String[] args) {
		System.out.println("Impressao dos primeiros 12 termos de fibonnacci: ");
		int fib[]=new int[12];
		int a=0;
		int b=1;
		for(int i=0;i<12;i++) {
			a=a+b;
			b=a-b;
			fib[i]=b;
		}
		
		System.out.println("Os 12 primeiros termos da sequencia sao: "+Arrays.toString(fib));
	}
}
