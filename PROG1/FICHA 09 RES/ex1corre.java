import java.util.Scanner;
public class ex1corre{
	
	public static void main(String[]args){
		Scanner ler= new Scanner(System.in);
		System.out.println("Qual e o elemento que deseja ver:  ");
		int n=ler.nextInt();
		acharTermo(n);
	}
	
	public static int return acharTermo(int n){
		if(n<5){
			return 1;
		}else{
			System.out.println();
		}
		
	}
}