import java.util.*;
public class arrayB1{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o nr de linhas e colunas que pretende ver: ");
		int m=ler.nextInt();
		int n=ler.nextInt();
		int V[][]=new int [m][n];
		
		for(int i=0;i<m;i++){
			System.out.println("Preencha a linnha nr "+(i+1));
			
			for(int j=0;j<n;j++){
				System.out.println("Preencha a linnha nr "+(j+1));
				V[i][j]=ler.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;i<n;j++){
				System.out.println(V[i][j]);
			}
		}

	}
}