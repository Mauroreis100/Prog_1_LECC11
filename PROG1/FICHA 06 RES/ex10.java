import java.util.Scanner;
import java.lang.Math;
public class ex10{
	public static Scanner ler=new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.println("Deseja calcular area de que figura:  ");
		System.out.println("1-circulo; 2-Triangulo; 3- Quadrado");
		int escolha=ler.nextInt();
		switch(escolha){
			case 1:System.out.println("Area do circulo: "+areaC());break;
			case 2:System.out.println("Area do Triangulo: "+areaT());break;
			case 3:System.out.println("Area do quadrado "+areaQ());break;
			default:System.out.println("Opcao invalida: ");break;	
		}	
	}
	public static double areaC(){
		System.out.println("Informe a medida do raio");
		double r=ler.nextDouble();
		double aC=r*r*Math.PI;
		return aC;
	}
		
	public static double areaT(){
		System.out.println("Informe a medida da base e da altura: ");
		double b=ler.nextDouble();
		double h=ler.nextDouble();
		double aT=(b*h)/2;
		return aT;
	}
	
	public static double areaQ(){
		System.out.println("Informe a medida do lado ");
		double l=ler.nextDouble();
		double aQ=Math.pow(l,2);
		
		return aQ; 
	}
}