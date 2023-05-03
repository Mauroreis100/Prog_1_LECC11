import java.util.Scanner;
import java.util.Arrays;
public class ex4{
	public static Scanner ler=new Scanner(System.in);
	public static int n;
	public static void main(String[] args){
		System.out.println("Insira a quantidade de nrs que pretende inserir");
		int n=ler.nextInt();
		
		int V[]=new int[n];
		int Trocar[]=new int[n];
		preencherV(n,V);
		substituirV(n,V,Trocar);
		mostrarVeT(n,V,Trocar);
	}
	
	public static void preencherV(int n, int V[]){
		
		System.out.println("Insira "+n+" nrs: ");
		for(int i=0;i<n;i++){
			V[i]=ler.nextInt();
		}	
	}
	
	public static void substituirV(int n, int V[], int Trocar[]){
		for(int i=0;i<n;i++){
			if(V[i]%2!=0){
				Trocar[i]=-1;
			}else{
				Trocar[i]=1;
			}
		}
	}	
	
		public static void mostrarVeT(int n,int V[], int Trocar[]){
			for(int i=0;i<Trocar.length;i++){
				System.out.print(Trocar[i]+" ");
			}
			System.out.println("Antes da trocar o vector era: "+Arrays.toString(V));
			
			System.out.println("Depois da trocar o vector ficou: "+Arrays.toString(Trocar));
		}
}