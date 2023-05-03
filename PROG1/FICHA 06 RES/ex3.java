
import java.util.Scanner;
public class ex3{
	 
	public static void main (String[] args){
		Scanner ler=new Scanner(System.in);
		System.out.println("Informe um nr maior que 0 para fazer a tabela: ");
		int n = ler.nextInt();
		while(n<=0){
			System.out.println("Insira um nr valido");
			n=ler.nextInt();
		}
		
		
		char simbolo='*';
		mostrarTabela(n,simbolo);
	}
	
	public static void mostrarTabela(int n,char simbolo){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(simbolo+" ");
			}
			System.out.println("");
		}
	}
}