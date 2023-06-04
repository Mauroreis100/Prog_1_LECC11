package exercicio4;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Principios atributos=new Principios();
	Scanner ler=new Scanner(System.in);
	System.out.println("Nome:");
	atributos.setNome(ler.next());
	System.out.println("Idade:");
	atributos.setIdade(ler.nextFloat());
	System.out.println("Altura:");
	atributos.setAltura(ler.nextFloat());
	System.out.println(atributos.toString());
}
}
