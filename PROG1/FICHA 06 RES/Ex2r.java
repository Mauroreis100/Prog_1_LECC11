import java.util.Scanner;
public class Ex2r{
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		
		boasVindas();
		
		System.out.println("Insira dois nrs: ");
		double x=ler.nextDouble();
		double y=ler.nextDouble();
		
		double adicao = somar(x,y);
		double subtracao = sub(x,y);
		double divisao = div(x,y);
		double mutliplicacao= multi(x,y);
		
		System.out.println("A adicao =: "+adicao);
		System.out.println("A subtracao =: "+subtracao);
		System.out.println("A divisao =: "+divisao);
		System.out.println("A mutliplicacao =: "+mutliplicacao);
	}

	public static void boasVindas(){
		System.out.println("Bem-vindo a minha calculadora.");
	}
	
	public static double somar(double x, double y){
		return x+y;
	}
	
	public static double sub(double x, double y){
		return x-y;
		
	}
	
	public static double div(double x, double y){
		return x/y;
		
	}
	
	public static double multi (double x, double y){
		return x*y;
		
	}
}