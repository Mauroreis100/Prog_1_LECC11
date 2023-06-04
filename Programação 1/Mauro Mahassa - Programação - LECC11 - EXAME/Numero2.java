import java.util.Scanner;
import java.util.Arrays;
public class Numero2{
	public static void main(String args[]){
	Scanner ler=new Scanner(System.in);
		System.out.println("Quantos candidatos  tem na eleição?");
		int candidatos =ler.nextInt();

		System.out.println("Quantos votantes existem?");
		int votantes=ler.nextInt();		
		int c[]=new  int[candidatos];
		while(votantes>0){
			System.out.println("Número de votantes: "+votantes);
			System.out.println("Digite o número correspondente ao candidato");
			for (int i=0; i<candidatos;i++){
				System.out.println((i+1)+" para o Candidato "+(i+1) );
			}
			System.out.print(":");
			int escolha=ler.nextInt();
			if(escolha>0 && escolha<=candidatos){
				c[escolha-1]=c[escolha-1]+1;
				votantes--;
			}else{
			System.out.println("Candidato inválido");
			}
			
		}
System.out.println(Arrays.toString(c));
	}
}