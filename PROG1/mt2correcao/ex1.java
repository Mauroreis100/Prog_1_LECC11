import java.util.Scanner;
import java.lang.Math;
public class ex1{
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
			int min=0, min2=0;
			min=Math.min(x,y);
			min2=Math.min(min,z);
			
			return min2;
		}
	
}