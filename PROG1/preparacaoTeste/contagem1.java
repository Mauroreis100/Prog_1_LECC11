import java.util.Scanner;
public class contagem1 {
	public static Scanner ler =new Scanner(System.in);
	public static void main(String args[]){
		
		System.out.println("Insira a quantidade candidatos: ");
		int n=ler.nextInt();
		System.out.println("Insira a quantidade de nrs votantes :");
		int votante=ler.nextInt();
		
		int votos[]=new int [n];
		
		preencherV(votos,n,votante);
		mostrarV(votos,n);
	}	
		
	public static void preencherV(int [] votos,int n,int votante){
		while(votante!=0){
			System.out.println("Deseja votar que candidatos: ");
			int nrCand=ler.nextInt();
			votos[nrCand]++;
			votante--;
			}
	}
		
		public static void mostrarV(int[]votos, int n){
			for(int i=0;i<n;i++){
				System.out.println("Candidato "+(i)+" tem "+votos[i]+" votos");
			}
		}
}