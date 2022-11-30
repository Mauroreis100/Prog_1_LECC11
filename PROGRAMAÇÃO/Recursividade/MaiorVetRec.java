import java.util.Scanner;
	public class MaiorVetRec{
		public static Scanner ler = new Scanner(System.in);
		public static int [] preencher(int n){
			int V[] = new int[n];
			for(int i =0; i<V.length; i++){
				System.out.println("Insira o valor"+(i+1));
				V[i]=ler.nextInt();
			}
			return V;
		}
		public static int maior(int V[], int tam, int indice){
			if(tam == 0){
				return V[indice];
			} else if(V[tam - 1] > V[indice]){
				return maior(V, tam - 1, tam - 1);
			}else{
				return maior(V, tam - 1, indice);
			}
		}
		public static void main(String args []){	
			System.out.print("Insira o tamanho do vetor");
			int n = ler.nextInt();
			int A[]= preencher(n);
			int indice=0;
			int res = MaiorVetRec.maior(A, n, indice);
			System.out.println(res);
		}
		
	
	}