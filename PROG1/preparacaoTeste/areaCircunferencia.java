import java.util.Scanner;
import java.lang.Math;
public class areaCircunferencia{
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		System.out.println("Insira a medida do raio: ");
		double r=ler.nextDouble();
		double areaC=Math.PI*Math.pow(r,2);
		System.out.println("Area= "+areaC);
		System.out.println("Aredondado por defeito ="+Math.floor(areaC));
		System.out.println("Aredondado por excesso ="+Math.round(areaC));
		System.out.println("Aredondado  ="+Math.ceil(areaC));
		
	}

}