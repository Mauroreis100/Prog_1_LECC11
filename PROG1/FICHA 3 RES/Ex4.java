import java.util.Scanner;
public class Ex4 {
	public static void main (String[] args) {
		
		int adesao ;
		Scanner ler = new Scanner (System.in);
		System.out.println ("Selecione o tipo de adesao: [1 - tipoA]/ [2 - tipoB] [ 3 - tipoC]");
		adesao = ler.nextInt ();
			
		switch (adesao) {
		case 1 : System.out.println ("O seu desconto e de 10 por cento"); break;
		case 2 : System.out.println ("O seu desconto e de 15 por cento"); break;
	    case 3 : System.out.println ("O seu desconto e de 20 por cento"); break;
		default : System.out.println ("Opcao invalida"); break;	
		}	
	
	
	
	
	}
}