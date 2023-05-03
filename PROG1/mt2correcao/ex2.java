import java.util.Scanner;
public class ex2{
	public static int V[]=new int[15];
	public static int X[]=new int[15];
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String[] args){
		preencherV();
		preencherX();
		acharNrs(V,X);
		
	}
	
	public static void preencherV(){
		for(int i=0;i<V.length;i++){
			System.out.println("Insira o "+(i+1)+"o nr");
			V[i]=ler.nextInt();
		}
	}
	
		public static void preencherX(){
		for(int i=0;i<V.length;i++){
			System.out.println("Insira o "+(i+1)+"o nr");
			X[i]=ler.nextInt();
		}
	}
	
	public static void acharNrs(int V[],int X[]){
		int cont=0;
		System.out.println("Os nrs que sao iguais sao: ");
		for(int i=0;i<V.length;i++){
			if(V[i]==X[i]){
				 cont++;
				System.out.println(V[i]);
			}
		}
		System.out.println("A quantidade de vezes que os dois conjuntos apresentam nrs iguais= "+cont);
		
	}
	
	
	
}

