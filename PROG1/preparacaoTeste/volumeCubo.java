import java.util.Scanner;
import java.lang.Math;
public class volumeCubo{
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		System.out.println("Insira a medida do lado do cubo: ");
		double lado=ler.nextDouble();
		
		double area= Math.pow(lado,3);
		System.out.println("Area= "+area);
	}
}