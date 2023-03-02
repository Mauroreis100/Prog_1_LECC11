/*Faça um programa denominado de PagamentoSeguros que visa determinar quanto vai custar 
a um indivíduo contratar uma política de seguros
 de automóveis, sabendo que a empresa oferece dois tipos de políticas ou apólices: 
 cobertura contra todos (A) e danos contra terceiros (B). 
 Para o plano A, a taxa base é de 22.200,00Mtn e, para B 3.350,00Mtn. 
 Ambos os planos cobram 10% do custo se a pessoa que dirige tem o hábito de beber álcool, 5% se usam óculos, 
 5% se sofrem de alguma doença (como insuficiência cardíaca ou diabetes) 
 e se têm mais de 40 anos de idade cobra 20%, senão apenas 10%. 
 Todas essas cobranças são feitas no custo base de cada uma das políticas. 
 */
import java.util.Scanner;
public class PagamentoSeguros{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int Cober,respBebe,respOculos,respDoenca,respIdade;
		double pBeber=0,pOclos=0,pDoenca=0,pIdade=0,pTotal=0;
		System.out.println("Quale e a sua cobertura(1/2)");
		Cober= input.nextInt();
		System.out.println("Tem habito de beber?(1/2)");
		respBebe= input.nextInt();
		System.out.println("Usa oculos?(1/2)");
		respOclos= input.nextInt();
		System.out.println("Tem alguma doenca?(1/2)");
		respDoenca= input.nextInt();
		System.out.println("a sua idade e superior a 40?(1/2)");
		respIdade= input.nextInt();
		if(Cober==1){
			Cober=22000;
		}else{ 
		 if(Cober==2)
			Cober=3350;
		}	
		if(respBebe==1){
			pBeber=Cober*0.1;
		}
		if(respOclos==1){
			pOclos=Cober*0.05;
		}
		if(respDoenca==1){
			pDoenca=Cober*0.05;
		}
		if(respIdade==1){
			pIdade=Cober*0.2;
		}else{
			pIdade=Cober*0.1;
		}
		pTotal=Cober+pBeber+pDoenca+pIdade+pOclos;
		System.out.println("O seu valor final ficou"+pTotal);
	}
}
 
 
 