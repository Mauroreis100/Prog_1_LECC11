import java.util.Scanner;
public class Ex2{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
		boasVindas();

		System.out.println("Insira dois nr: ");
		double x=ler.nextDouble();
		double y=ler.nextDouble();
		
		soma(x,y);
	
	}
	
	public static void boasVindas(){
		System.out.println("Bem-vindo a minha calculadora.");
	}
	
	public static void soma(double x, double y){
		System.out.println("A soma de "+x+" e "+y+" ="+ x+y);
		
	}
}