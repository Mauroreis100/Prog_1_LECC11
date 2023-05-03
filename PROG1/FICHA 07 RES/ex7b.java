import java.util.*;
public class ex7b{
	public static int m,n;
	public static Scanner ler=new Scanner(System.in);
	public static void main(String [] args){
		
		System.out.println("Insira o nr de linhas(m) e colunas(n) que deseja para a tabela");
		m=ler.nextInt();
		n=ler.nextInt();
		
		int V[][]=new int[m][n];
		int Trocar[][]=new int[m][n];
		
		System.out.println("Preencha a tabela de dimensao "+m+"x"+n);
		
		for(int i=0;i<m;i++){
			System.out.println("Insira a "+(i+1)+"o linha: ");
			for(int j=0;j<n;j++){
				V[i][j]=ler.nextInt();
			}
		}
		
		visualizarV(m,n,V);
		trocarPeI(m,n,V,Trocar);
		printVeTrocar(m,n,V,Trocar);
	}	
		
	public static void visualizarV(int m, int n, int V[][]){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print(V[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void trocarPeI(int m, int n, int V[][], int Trocar[][]){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(V[i][j]%2==0){
					Trocar[i][j]=1;
				}else{
					Trocar[i][j]=-1;
				}
			}	
		}
	}
	public static void printVeTrocar(int m, int n, int V[][], int Trocar[][]){
		//System.out.println("A tabela antes da troca: "+Arrays.toString(V));
		//System.out.println("A tabela depois da troca: "+Arrays.toString(Trocar));
		System.out.println("A tabela antes da troca: ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print(V[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("A tabela depois da troca: ");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print(Trocar[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}