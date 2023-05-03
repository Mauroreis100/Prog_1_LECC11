import java.util.Scanner;
public class ex4{
	public static void main(String[] args){
		System.out.println("Insira o ulimo nr da sequencia (diferente de 0): ");
		int n=new Scanner(System.in).nextInt();
		
		while(n==0){
			System.out.println("O nr deve ser diferente de 0.");
			n=new Scanner(System.in).nextInt();
		}
		System.out.println("Sequencia em ordem decrescente: ");
		System.out.println("");
		decrescerAteN(n);

	}
	
	public static void decrescerAteN(int n){
		if(n!=0){
			System.out.print(n+" ");
			//n--;
			decrescerAteN(n-1);
		}
	}
}