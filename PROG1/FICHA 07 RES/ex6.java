import java.util.*;
public class ex6{
	public static Scanner ler=new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Quantos nrs deseja inserir: ");
		int n=ler.nextInt();
		
		int v[]=new int[n];
		boolean x[]=new boolean[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o"+(i+1)+"o nr");
			v[i]=ler.nextInt();
		}
		preencherX(n,v,x);
	}	
	
	public static void preencherX(int n,int v[],boolean x[]){		
		for(int i=0;i<n;i++){
			if(v[i]<=0){
				x[i]=false;
			}else{
				x[i]=true;
			}
		}
		System.out.println("O vector de inteiros: "+Arrays.toString(v));
		System.out.println("O vector de booleans: "+Arrays.toString(x));
	}
}