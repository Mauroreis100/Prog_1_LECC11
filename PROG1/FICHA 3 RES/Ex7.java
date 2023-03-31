import java.util.Scanner;
public class Ex7{
	public static void main(String[]args){
	Scanner ler = new Scanner(System.in);
	//declaracao
	char tipoplano;
	char respalc, respd, respoc, respidade;
	double txbase, acrescalc, acrescd, acrescoc, acrescidade, custofinal;
	
	//inicializacao
	
	txbase=0;
	acrescalc=0;
	acrescd=0;
	acrescoc=0;
	acrescidade=0;
	custofinal=0;
	
		System.out.println("Qual e o tipo de plano? A ou B?");
		tipoplano = ler.next().charAt(0);
		if(tipoplano=='A'){
			txbase=22200;
		}else if(tipoplano=='B'){
			txbase=3350;
			
		}else{
			System.out.println("Opcao invalida macaco");
		}	
/*caso beba, tem q pagar 10% da txbase,
caso use oculos, tem q pagar 5%
caso tenha alguma doenca, 5%
se tiver maior que 40%, senao10%

*/ 		
		System.out.println("Tem habito de beber?");
		respalc=ler.next().charAt(0);
			if(respalc=='s'){
				acrescalc=txbase*0.1;
			}else if(respalc=='n'){
				acrescalc=0;
			}else{
				System.out.println("Opcao invalida macaco");
				acrescalc=0;
			}	
		
		
		System.out.println("Tem alguma doenca?");
		respd=ler.next().charAt(0);
			if(respd=='s'){
				acrescd=txbase*0.05;
			}else if(respd=='n'){
				acrescd=0;
			}else{
				System.out.println("Opcao invalida macaco");
				acrescd=0;
			}		
		
		System.out.println("Usa oculos?");
		respoc=ler.next().charAt(0);
			if(respoc=='s'){
				acrescoc=txbase*0.05;
			}else if(respd=='n'){
				acrescoc=0;
			}else{
				System.out.println("Opcao invalida macaco");
				acrescoc=0;
			}		
		
		System.out.println("Tem mais de 40 anos?");
		respidade=ler.next().charAt(0);
			if(respidade=='s'){
				acrescidade=txbase*0.2;
			}else if(respidade=='n'){
				acrescidade=txbase*0.1;
			}else{
				System.out.println("Opcao invalida macaco");
				acrescidade=0;
			}		
		custofinal=txbase+acrescalc+acrescd+acrescidade+acrescoc;
		
		System.out.println("o valor total a pagar e "+custofinal);	
	
	}
}