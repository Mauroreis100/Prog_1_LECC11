import java.util.Scanner;
public class Ex22{
public static void main(String args[]){
Scanner ler=new Scanner(System.in);	
	String palavra;
	char arg;
	char CaractP;
	
	
	
	System.out.println("Insira a palavra: ");
	palavra=ler.next();
	System.out.println("Insira o argumento: ");
	arg=ler.next().charAt(0);
	
	for (int i=0;i<palavra.length();i++){
		 CaractP = palavra.charAt(i);//i representa posicao de cada letra
	
			if(CaractP==arg){//ira imprimir todas as substrings que iniciam com o argumento
				
				System.out.println(palavra.substring(0,i+1));//
				i++;
				
			}
			
		
	}
}
}