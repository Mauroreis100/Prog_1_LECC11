package mainCirculo;
import circulo.Circulo;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Circulo o=new Circulo();
	Scanner ler=new Scanner(System.in);
	System.out.println("Raio do circulo: ");
	o.setRaio(ler.nextDouble());
	System.out.println(o.toString());
}
}
