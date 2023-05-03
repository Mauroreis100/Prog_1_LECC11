import java.util.Scanner;
import static java.lang.Math.min;//para nao escrever repetidamente  Math.min
public class ex1alt{
	public static void main(String args[]){
		Scanner ler=new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Insira tres nrs: ");
		x=ler.nextInt();
		y=ler.nextInt();
		z=ler.nextInt();
		System.out.println("O menor valor e: "+acharM(x,y,z));
	}
		
		public static int acharM(int x, int y, int z){
			int menor=0, menor2=0;
			menor=min(x,y);
			menor2=min(menor,z);
			
			return menor2;
		}
	
}