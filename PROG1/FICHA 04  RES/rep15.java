import java.util.Scanner;
public class rep15{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	
	int n,contImp=0,contPar=0,soma=0,media=0,i=0,j=0,maior=0,menor=0;
	
	System.out.print("Insira 2 nr e digite 0 para finalizar");
	j=ler.nextInt();
	
	
		do{
			n=ler.nextInt();
		if(n<j){
			menor=n;
			maior=j;
		}else{
			menor=j;
			maior=n;
			
			soma+=n;
			if(n%2==0 && j%2==0){
				contPar++;
				
			}else{
				contImp++;
			}
		}
		}
		i++;
		
		}while(n!=0);//Condicao que irá parar de pedir os nrs
		media=soma/i;
	
	System.out.println("A soma dos nrs e "+soma+" e a media e "+media);
	System.out.println("Foram inseridos "+contImp+" nr impares e "+contPar+" nr pares");