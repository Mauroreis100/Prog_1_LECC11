// Ficha 04 exercício nr 3
import java.util.Scanner;
public class Soma1aN{
public static void main(String[]args){
	
	Scanner ler=new Scanner(System.in);
	int soma=0; 
	int cont=0;
	
	System.out.println("Insira o valor de n");
	int n=ler.nextInt();
		while (cont<n){
		cont++;
		System.out.print(cont+ "+ ");
		soma=soma+cont;
		
		}
		System.out.println("="+soma);
}
}