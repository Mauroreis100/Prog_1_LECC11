import java.lang.Math;
import java.util.Scanner;
public class volumeCubo {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("Digite o comprimento do lado do cubo:");
		double lado=ler.nextDouble();
		double area=Math.pow(lado, 3);
		System.out.print("A área do cubo é: "+area);
	}

}
