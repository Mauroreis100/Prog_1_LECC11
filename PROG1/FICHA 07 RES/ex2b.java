import java.util.*;
public class ex2b{
	public static Scanner ler = new Scanner (System.in);
	public static Random r=new Random();
	
	public static void main(String[] args){
		System.out.println("Quantas linnhas e colunas deseja: ");
		int m=ler.nextInt();
		int n=ler.nextInt();
		int nrsR[][]=new int[m][n];
		
		//System.out.println("Preencha a matriz de "+m+" linhas e "+n+" colunas");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				nrsR[i][j]= r.nextInt(100);
			}
		}
		
		System.out.println("A matriz preenchida com nrs aleatorios menores que 100: ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(nrsR[i][j]+" ");
			}
			System.out.println();
		}
	}
}