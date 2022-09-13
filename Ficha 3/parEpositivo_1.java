import java.util.Scanner;

public class sorvete4 {

	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
 
		System.out.println("Digite 'a' para sorvete tipo A, 'b' para sorvete tipo B e 'c' para sorvete tipo C ");
		char sorvete=ler.next().charAt(0);
		System.out.println("Quanto custa o sorvete?");
		double custo=ler.nextDouble();
		double paga;
		switch(sorvete){
			case 'a':
				paga=custo-(0.1*custo);
				System.out.println("O cliente irá pagar "+paga+"com 10% de desconto"+custo);
				break;
				case 'b':
				paga=custo-(0.15*custo);
				System.out.println("O cliente irá pagar "+paga+"com 10% de desconto"+custo);
				break;
				case 'c':
				paga=custo-(0.20*custo);
				System.out.println("O cliente irá pagar "+paga+"com 10% de desconto"+custo);
				break;
			default:
				System.out.println("Opção Inválida");
				break;
		}
		
	}

}
