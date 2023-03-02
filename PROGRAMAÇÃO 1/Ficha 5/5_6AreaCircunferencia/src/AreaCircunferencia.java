import java.lang.Math;
import java.util.Scanner;

public class AreaCircunferencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Raio da circunferência");
		double r = ler.nextDouble();
		double area = Math.PI * Math.pow(r, 2);
		System.out.print("A área da circunferência de raio " + r + " é " + area);

	}
}
