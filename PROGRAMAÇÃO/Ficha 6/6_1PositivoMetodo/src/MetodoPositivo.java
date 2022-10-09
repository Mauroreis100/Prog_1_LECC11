import java.util.Scanner;
public class MetodoPositivo {
	public static boolean Decisao(int n) {
		boolean numero;
		if(n>0) {
			numero=false;

		}else {
			numero=true;
	
		}
		return numero;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner ler=new Scanner(System.in);
System.out.println("Digite um número");
int n=ler.nextInt();

if(Decisao(n)==false) {
	System.out.print("Este número é positivo");
}else {
	System.out.print("Este número é negativo");
}
	}

}
