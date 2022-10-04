//Ex9 Programa em Java para calcular soma, média e quantidade de n números digitados
import java.util.Scanner;
public class Medi9{
	public static void main(String[]args){
	Scanner ler = new Scanner(System.in);
	int n=0, soma=0, i=0, x;
	double media;
	
	System.out.println("Insira a quantidade de nrs");
	n=ler.nextInt();
	
		do{
			System.out.println("Insira um nr");
			x=ler.nextInt();
			i++;
			
			soma+=x;
			
		}while(i<n);
		media=soma/n;
	System.out.println("A soma e "+soma+" e a media e "+media);
	}

}