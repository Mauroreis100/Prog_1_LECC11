import java.util.Scanner;
import java.lang.Math;

public class Ex6{
	public static void main (String args[]){
	Scanner ler=new Scanner(System.in);
	double r,g,A;
	
	
	System.out.println("Insira o valor do raio e da geratriz: ");
	r=ler.nextDouble();
	g=ler.nextDouble();
	
	A=Math.PI*r*(r+g);
	
	System.out.println("O valor da area do cone e: "+A);
	
	
	}

}