import java.util.Scanner;
public class FactorialRec{
	public static int fatorial(int num) {
		if(num==0 || num==1) {
			return 1;
		} 
		else{
			return num*fatorial(num-1);
		}
	}
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira n!");
		int num= ler.nextInt();
		int resultado=fatorial(num);
		System.out.println(num+"!="+resultado);
	}
}  