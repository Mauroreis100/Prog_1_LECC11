import java.util.Scanner;

public class CalculadoraMetodos {
public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite 2 números");
	int n = ler.nextInt();
	int v = ler.nextInt();
	System.out.println(n+"+"+v+"="+soma(n,v));
	System.out.println(n+"-"+v+"="+subtraccao(n,v));
	System.out.println(n+"/"+v+"="+divisao(n,v));
	System.out.println(n+"*"+v+"="+multiplicacao(n,v));
}
public static double soma (double n, double v) {
	double soma;
	return soma=n+v;
}
public static double subtraccao (double n, double v) {
	double subtraccao;
	
	return subtraccao=n-v;
}
public static double divisao (double n, double v) {
	double divisao;
	
	return divisao=n/v;
}
public static double multiplicacao (double n, double v) {
	double multiplicacao;
	
	return multiplicacao=n*v;
}

}
