import java.util.Scanner;
	public class SomarArrayRec{
		public static Scanner ler = new Scanner(System.in);
		public static int [] preencher(int n){
			int V[] = new int[n];
			for(int i =0; i<V.length; i++){
				System.out.println("Insira o valor"+(i+1));
				V[i]=ler.nextInt();
			}
			return V;
		}
		public static int somarV(int V[], int n){
			if(n == 0){
				return 0;
			}else{
				return V[n-1]+ somarV(V, n - 1);
			}
		}
		public static void main(String args[]){
			System.out.print("Qual o tamanho do vetor?");
			int tam = ler.nextInt();
			int A[] = preencher(tam);
			int res = SomarArrayRec.somarV(A,tam);
			System.out.println("Soma = "+res);
		} 
	}