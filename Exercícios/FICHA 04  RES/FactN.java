//Ex7 Faca um programa que permite calcular o factorial de um número escolhido pelo usuário.
import java.util.Scanner;
public class FactN{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	
	int fact=1, i, n;
	System.out.println("Insira um numero que deseja que se calcule o seu factorial");
	n=ler.nextInt();
	
		for(i=1;i<=n;i++){
	
		fact=fact*i;//fact*=i;	
			
		}	
	System.out.println("O factorial do numero escolhido e "+fact);
	
	}
}