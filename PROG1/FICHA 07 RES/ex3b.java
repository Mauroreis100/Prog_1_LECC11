import java.util.*;
public class ex3b{
	public static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Quantas linhas e colunas deseja para a matriz: ");
		int m=ler.nextInt();
		int n=ler.nextInt();
		int V[][]=new int[m][n];
		
		for(int i=0;i<m;i++){
			System.out.println("Preencha a linha "+(i+1));
			for(int j=0;j<n;j++){
				V[i][j]=ler.nextInt();
			}
		}
		
		System.out.println("Insira o nr da linha que deseja ver a media dos valores: ");
		int l=ler.nextInt()-1;
		
		while(l>V.length || l<0){
			System.out.println("Insira um nr valido.");
			l=ler.nextInt();
		}	
		
		double media=0;
		int soma=0;
	
		for(int j=0;j<V[l].length;j++){
			soma=soma+V[l][j];
		}
		
		media=soma/V[l].length;
		
		System.out.println("A media da linha : ");
		for(int j=0;j<V[l].length;j++){
			System.out.print(V[l][j]+" ");
		}
		
		System.out.println();
		
		System.out.println("Media ="+media);
		
	}
	
}