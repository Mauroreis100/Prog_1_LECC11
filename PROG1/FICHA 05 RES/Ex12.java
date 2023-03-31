import java.util.Scanner;
import java.lang.Math;
public class Ex12{
	public static void main (String args[]){
		
	Scanner ler=new Scanner(System.in);
	double x,y;
	
	System.out.println("Insira um nr decimal: ");
	x=ler.nextDouble();
	
	double r=Math.round(x);

	System.out.println(r);
	ler.close();
	}
}
	
	