package exercicio2;
import java.util.Scanner;

public class Soma {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	System.out.print("A: ");
	int a=ler.nextInt();
	System.out.print("B: ");
	int b=ler.nextInt();
	System.out.print("C: ");
	int c=ler.nextInt();
	int soma=a+b+c;
	System.out.println(a+"+"+b+"+"+c+"="+soma);
}
}
