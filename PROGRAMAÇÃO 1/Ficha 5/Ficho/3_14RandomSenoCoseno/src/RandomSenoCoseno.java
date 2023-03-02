import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class RandomSenoCoseno {
	public static void main (String Args[]){
		Scanner read = new Scanner (System.in);
		System.out.println("Insira um numero: ");
		double n = read.nextDouble();
		double x = Math.round(Math.random()*n);
		System.out.println("Seno: "+Math.sin(Math.toRadians(x)));
		System.out.println("Cosseno: "+Math.cos(Math.toRadians(x)));
		System.out.println("Tangente: "+Math.tan(Math.toRadians(x)));
		System.out.println("Raiz: "+Math.sqrt(x));
		System.out.println("Potencia: "+Math.pow(x,n));
		System.out.println("O numero aleatorio escolhido foi: "+x);
	}
}