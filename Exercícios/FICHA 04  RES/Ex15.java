/*Ex15
Faça um programa que peça para o usuário ir informando números até que ele informe 0. Após isto apresente os seguintes dados sobre os nrs digitados:

i. O maior número; O menor
ii. A soma dos números e media;
iii. A quantidade de números pares e impares;
*/
import java.util.Scanner;
public class Ex15{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	
	int n,contImp=0,contPar=0,soma=0,media=0,i=0;
	
	System.out.print("Insira um nr e digite 0 para finalizar");
	
		do{
			n=ler.nextInt();
		if()
		{
				
		}			
			soma+=n;
			if(n%2==0){
				contPar++;
				
			}else{
				contImp++;
			}	
		i++;
		}while(n!=0);//Condicao que irá parar de pedir os nrs
		media=soma/i;
	
	System.out.println("A soma dos nrs e "+soma+" e a media e "+media);
	System.out.println("Foram inseridos "+contImp+" nr impares e "+contPar+" nr pares");
	
	}
}