/*Ex 13
 Execute um programa que solicite o carregamento de um valor inteiro de 1 a 10. A seguir mostre a tabuada
*/
import java.util.Scanner;
public class tabuada{
	public static void main(String[] args){
	Scanner ler= new Scanner(System.in);
	int n=1, i;
	System.out.println("Insira um nr de 1 a 10");
	n=ler.nextInt();
		if(n<=10){
			for(i=1;i<=10;i++){
				
				System.out.println(n+" X "+i+" = "+n*i);

			}	
			
		}else{
			System.out.println("Insira um nr de 1 a 10!!");
		}
	}
}