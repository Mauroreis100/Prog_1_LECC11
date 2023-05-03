import java.util.*;
public class ex16{
	public static int n;
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String args[]){
		System.out.println("Quantos nrs quer inserir: ");
		n=ler.nextInt();
		
		int V[]=new int [n];
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o nr");
			V[i]=ler.nextInt();
			
		}
		ordenarV(n,V);
	}
	
	public static void ordenarV(int n,int V[]){
		System.out.println("Antes de estar em ordem crescente: "+Arrays.toString(V));
		int maior=V[0], maior2=V[1];
		for(int i=2;i<n;i++){
			if(V[i]<=maior && V[i]<=maior2){
				System.out.println(V[i]+" ");
			}
		}
	}
	
}